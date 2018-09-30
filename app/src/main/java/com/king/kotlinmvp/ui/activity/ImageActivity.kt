package com.king.kotlinmvp.ui.activity

import android.graphics.Rect
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.king.kotlinmvp.R
import com.king.kotlinmvp.base.BaseActivity
import com.king.kotlinmvp.mvp.contract.ImageContract
import com.king.kotlinmvp.mvp.model.bean.ImageResult
import com.king.kotlinmvp.mvp.presenter.ImagePresenter
import com.king.kotlinmvp.showToast
import com.king.kotlinmvp.ui.adapter.ImageAdapter
import com.king.kotlinmvp.utils.DisplayManager
import com.scwang.smartrefresh.layout.api.RefreshLayout
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener
import com.scwang.smartrefresh.layout.listener.OnRefreshListener
import kotlinx.android.synthetic.main.activity_image.*

/**
 * <pre>
 *     author : Wp
 *     e-mail : 18141924293@163.com
 *     time   : 2018/09/29
 *     desc   : 图片展示
 *     version: 1.0
 * </pre>
 */
class ImageActivity : BaseActivity(), ImageContract.View, OnRefreshListener, OnLoadmoreListener {

    /**
     * 懒加载Presenter
     */
    private val mPresenter by lazy { ImagePresenter() }

    init {
        mPresenter.attachView(this)
    }

    private var mImageList = ArrayList<ImageResult>()

    /**
     * 懒加载ImageAdapter
     */
    private val mAdapter by lazy { let { ImageAdapter(it, mImageList, R.layout.item_image) } }

    private var url: String = "http://www.mmonly.cc/ktmh/dmmn/"

    /**
     * 分页
     */
    private var currentPage: Int = 2

    private var isRefresh: Boolean = true


    override fun layoutId(): Int {
        return R.layout.activity_image
    }

    override fun initData() {
        //初始化分页
        refreshLayout.isEnableAutoLoadmore = true
        refreshLayout.isEnableRefresh = true
        refreshLayout.setOnRefreshListener(this)
        refreshLayout.setOnLoadmoreListener(this)

    }

    override fun initView() {
        //初始化Adapter
        mLayoutStatusView = multipleStatusView
        mGridView.layoutManager =GridLayoutManager(this@ImageActivity,2)
        mGridView.adapter = mAdapter
        mGridView.addItemDecoration(object : RecyclerView.ItemDecoration() {
            override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State?) {
                val position = parent.getChildPosition(view)
                val offset = DisplayManager.dip2px(2f)!!
                outRect.set(if (position % 2 == 0) 0 else offset, offset,
                        if (position % 2 == 0) offset else 0, offset)
            }

        })
    }
    /**
     * 网络请求初始化加载
     */
    override fun start() {
        mPresenter.getImageList(url)
    }

    override fun showError(errorMsg: String) {
        showToast(errorMsg)
    }

    override fun showImageData(imageSet: HashSet<ImageResult>) {
        val list: ArrayList<ImageResult> = ArrayList()
        imageSet.forEach {
            list.add(it)
        }
        if (isRefresh) {
            mAdapter.setData(list)
            refreshLayout.finishRefresh()
        } else {
            mAdapter.addData(list)
            refreshLayout.finishLoadmore()
        }

    }

    override fun showLoading() {
        multipleStatusView?.showLoading()

    }

    override fun dismissLoading() {
        multipleStatusView?.showContent()
    }

    override fun onRefresh(refreshlayout: RefreshLayout?) {
        url = "http://www.mmonly.cc/ktmh/dmmn/"
        isRefresh = true
        currentPage = 2
        mPresenter.getImageList(url)
    }

    override fun onLoadmore(refreshlayout: RefreshLayout?) {
        isRefresh = false
        url = "http://www.mmonly.cc/ktmh/dmmn/list_29_$currentPage.html"
        mPresenter.getImageList(url)
        currentPage++
    }

}