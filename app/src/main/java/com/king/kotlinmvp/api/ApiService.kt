package com.king.kotlinmvp.api

import com.king.kotlinmvp.mvp.model.bean.AuthorInfoBean
import com.king.kotlinmvp.mvp.model.bean.CategoryBean
import com.king.kotlinmvp.mvp.model.bean.HomeBean
import com.king.kotlinmvp.mvp.model.bean.TabInfoBean
import io.reactivex.Observable
import retrofit2.http.*

/**
 * Created by xuhao on 2017/11/16.
 * Api 接口
 */

interface ApiService{

    /**
     * 保存App信息
     */
    @Headers("method:SAVE_APP_INFO")
    @GET("mobileIn.do")
    fun saveAppInfo(@Query("appId") appId:String): Observable<String>

    /**
     * 首页精选
     */
    @GET("v2/feed?")
    fun getFirstHomeData(@Query("num") num:Int): Observable<HomeBean>

    /**
     * 根据 nextPageUrl 请求数据下一页数据
     */
    @GET
    fun getMoreHomeData(@Url url: String): Observable<HomeBean>

    /**
     * 根据item id获取相关视频
     */
    @GET("v4/video/related?")
    fun getRelatedData(@Query("id") id: Long): Observable<HomeBean.Issue>

    /**
     * 获取分类
     */
    @GET("v4/categories")
    fun getCategory(): Observable<ArrayList<CategoryBean>>

    /**
     * 获取分类详情List
     */
    @GET("v4/categories/videoList?")
    fun getCategoryDetailList(@Query("id") id: Long): Observable<HomeBean.Issue>

    /**
     * 获取更多的 Issue
     */
    @GET
    fun getIssueData(@Url url: String): Observable<HomeBean.Issue>

    /**
     * 获取全部排行榜的Info（包括，title 和 Url）
     */
    @GET("v4/rankList")
    fun getRankList():Observable<TabInfoBean>

    /**
     * 获取搜索信息
     */
    @GET("v1/search?&num=10&start=10")
    fun getSearchData(@Query("query") query :String) : Observable<HomeBean.Issue>

    /**
     * 热门搜索词
     */
    @GET("v3/queries/hot")
    fun getHotWord():Observable<ArrayList<String>>

    /**
     * 关注
     */
    @GET("v4/tabs/follow")
    fun getFollowInfo():Observable<HomeBean.Issue>

    /**
     * 作者信息
     */
    @GET("v4/pgcs/detail/tab?")
    fun getAuthorInfo(@Query("id") id: Long):Observable<AuthorInfoBean>



}