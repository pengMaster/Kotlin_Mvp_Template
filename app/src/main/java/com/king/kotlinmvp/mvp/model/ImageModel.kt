package com.king.kotlinmvp.mvp.model

import com.king.kotlinmvp.mvp.model.bean.parser.ImageListParser
import com.king.kotlinmvp.net.RetrofitManager
import com.king.kotlinmvp.rx.scheduler.SchedulerUtils
import io.reactivex.Observable
import java.util.*

/**
 * <pre>
 *     author : Wp
 *     e-mail : 18141924293@163.com
 *     time   : 2018/09/29
 *     desc   : ImageModel
 *     version: 1.0
 * </pre>
 */
class ImageModel {

    /**
     * 下载图片信息
     */
    fun getImageList(url: String): Observable<ImageListParser> {
        return RetrofitManager.service.getImageList(url)
                .compose(SchedulerUtils.ioToMain())
    }
}