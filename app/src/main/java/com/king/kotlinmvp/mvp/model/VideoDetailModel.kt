package com.king.kotlinmvp.mvp.model

import com.king.kotlinmvp.mvp.model.bean.HomeBean
import com.king.kotlinmvp.net.RetrofitManager
import com.king.kotlinmvp.rx.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 * Created by xuhao on 2017/11/25.
 * desc:
 */
class VideoDetailModel {

    fun requestRelatedData(id:Long):Observable<HomeBean.Issue>{

        return RetrofitManager.service.getRelatedData(id)
                .compose(SchedulerUtils.ioToMain())
    }

}