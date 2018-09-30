package com.king.kotlinmvp.api

import com.king.kotlinmvp.mvp.model.bean.parser.ImageListParser
import io.reactivex.Observable
import retrofit2.http.*

/**
 * Created by xuhao on 2017/11/16.
 * Api 接口
 */

interface ApiService{

    /**
     * 获取图片列表
     */
    @Headers("method:GET_IMAGE_LIST")
    @GET("mobile/mobileIn.do?")
    fun getImageList(@Query("url") url:String): Observable<ImageListParser>

}