package com.king.kotlinmvp.mvp.model

import com.king.kotlinmvp.mvp.model.bean.HomeBean
import com.king.kotlinmvp.mvp.model.bean.TabInfoBean
import com.king.kotlinmvp.net.RetrofitManager
import com.king.kotlinmvp.rx.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 * Created by xuhao on 2017/11/30.
 * desc: 热门 Model
 */
class HotTabModel {

    /**
     * 获取 TabInfo
     */
    fun getTabInfo(): Observable<TabInfoBean> {

        return RetrofitManager.service.getRankList()
                .compose(SchedulerUtils.ioToMain())
    }

}
