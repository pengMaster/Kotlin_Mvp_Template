package com.king.kotlinmvp.mvp.presenter

import com.king.kotlinmvp.base.BasePresenter
import com.king.kotlinmvp.mvp.contract.ImageContract
import com.king.kotlinmvp.mvp.model.ImageModel

/**
 * <pre>
 *     author : Wp
 *     e-mail : 18141924293@163.com
 *     time   : 2018/09/29
 *     desc   : ImagePresenter
 *     version: 1.0
 * </pre>
 */
class ImagePresenter:BasePresenter<ImageContract.View>(),ImageContract.Presenter{

    private val imageModel by lazy {
        ImageModel()
    }

    private var nextPageUrl:String?=null


    override fun getImageList(url: String) {
        checkViewAttached()
        val disposable= imageModel.getImageList(url)
                .subscribe({
                    issue ->
                    mRootView?.apply {
                        val code = issue.code
                        if ("200"==code && null!=issue.result){
                            showImageData(issue.result)

                        }

                    }
                },{
                    throwable ->
                    mRootView?.apply {
                        showError(throwable.toString())
                    }
                })

        addSubscription(disposable)    }



    /**
     * 加载更多数据
     */
//    override fun loadMoreData() {
//        val disposable = nextPageUrl?.let {
//            categoryDetailModel.loadMoreData(it)
//                    .subscribe({ issue ->
//                        mRootView?.apply {
//                            nextPageUrl = issue.nextPageUrl
//                            setCateDetailList(issue.itemList)
//                        }
//                    }, { throwable ->
//                        mRootView?.apply {
//                            showError(throwable.toString())
//                        }
//                    })
//        }
//
//        disposable?.let { addSubscription(it) }
//    }
}