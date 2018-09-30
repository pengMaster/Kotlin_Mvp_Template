package com.king.kotlinmvp.api

import com.king.kotlinmvp.mvp.model.bean.parser.ImageListParser
import io.reactivex.Observable
import retrofit2.http.*

/**
 * <pre>
 *     author : Wp
 *     e-mail : 18141924293@163.com
 *     time   : 2018/09/30
 *     desc   : Api接口
 *     version: 1.0
 * </pre>
 */
interface ApiService{

    /**
     * 获取图片列表
     */
    @Headers("method:GET_IMAGE_LIST")
    @GET("mobile/mobileIn.do?")
    fun getImageList(@Query("url") url:String): Observable<ImageListParser>

}