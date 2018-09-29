package com.king.kotlinmvp.mvp.presenter

import com.king.kotlinmvp.base.BasePresenter
import com.king.kotlinmvp.mvp.contract.RankContract
import com.king.kotlinmvp.mvp.model.RankModel
import com.king.kotlinmvp.net.exception.ExceptionHandle

/**
 * Created by xuhao on 2017/11/30.
 * desc: 获取 TabInfo Presenter
 */
class RankPresenter : BasePresenter<RankContract.View>(), RankContract.Presenter {

    private val rankModel by lazy { RankModel() }


    /**
     *  请求排行榜数据
     */
    override fun requestRankList(apiUrl: String) {
        checkViewAttached()
        mRootView?.showLoading()
        val disposable = rankModel.requestRankList(apiUrl)
                .subscribe({ issue ->
                    mRootView?.apply {
                        dismissLoading()
                        setRankList(issue.itemList)
                    }
                }, { throwable ->
                    mRootView?.apply {
                        //处理异常
                        showError(ExceptionHandle.handleException(throwable),ExceptionHandle.errorCode)
                    }
                })
        addSubscription(disposable)
    }
}