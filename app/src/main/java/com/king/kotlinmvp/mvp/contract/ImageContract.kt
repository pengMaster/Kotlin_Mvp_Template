package com.king.kotlinmvp.mvp.contract

import com.king.kotlinmvp.base.IBaseView
import com.king.kotlinmvp.base.IPresenter
import com.king.kotlinmvp.mvp.model.bean.ImageResult
import com.scwang.smartrefresh.layout.api.RefreshLayout

/**
 * <pre>
 *     author : Wp
 *     e-mail : 18141924293@163.com
 *     time   : 2018/09/29
 *     desc   : 图片信息
 *     version: 1.0
 * </pre>
 */
interface ImageContract {

    interface View : IBaseView {
        /**
         * 显示错误信息
         */
        fun showError(errorMsg:String)

        /**
         * 显示图片
         */
        fun showImageData(imageSet: HashSet<ImageResult>)
    }

    interface Presenter:IPresenter<View>{
        /**
         * 获取图片
         */
        fun getImageList(url: String)
    }
}