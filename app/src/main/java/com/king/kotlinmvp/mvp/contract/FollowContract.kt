package com.king.kotlinmvp.mvp.contract

import com.king.kotlinmvp.base.IBaseView
import com.king.kotlinmvp.base.IPresenter
import com.king.kotlinmvp.mvp.model.bean.HomeBean

/**
 * Created by xuhao on 2017/11/30.
 * desc: 契约类
 */
interface FollowContract {

    interface View : IBaseView {
        /**
         * 设置关注信息数据
         */
        fun setFollowInfo(issue: HomeBean.Issue)

        fun showError(errorMsg: String, errorCode: Int)
    }


    interface Presenter : IPresenter<View> {
        /**
         * 获取List
         */
        fun requestFollowList()

        /**
         * 加载更多
         */
        fun loadMoreData()
    }
}