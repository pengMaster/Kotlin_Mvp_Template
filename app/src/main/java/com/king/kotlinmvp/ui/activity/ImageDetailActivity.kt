package com.king.kotlinmvp.ui.activity

import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.load.model.LazyHeaders
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.king.kotlinmvp.Constants
import com.king.kotlinmvp.R
import com.king.kotlinmvp.base.BaseActivity
import com.king.kotlinmvp.glide.GlideApp
import com.king.kotlinmvp.mvp.model.bean.ImageResult
import kotlinx.android.synthetic.main.activity_image_detail.*

/**
 * <pre>
 *     author : Wp
 *     e-mail : 18141924293@163.com
 *     time   : 2018/09/30
 *     desc   : 图片详情
 *     version: 1.0
 * </pre>
 */
class ImageDetailActivity : BaseActivity() {

    override fun start() {
    }

    override fun layoutId(): Int {
        return R.layout.activity_image_detail
    }

    override fun initData() {

        val imageResult = intent.getSerializableExtra(Constants.BUNDLE_IMAGE_DATA) as ImageResult
        GlideApp.with(this@ImageDetailActivity)
                .load(GlideUrl(imageResult.url, LazyHeaders.Builder().addHeader("Referer", "http://www.mzitu.com/").build()))
                .placeholder(R.color.color_darker_gray)
                .transition(DrawableTransitionOptions().crossFade())
                .thumbnail(0.5f)
                .into(mImageView)

        mTvDesc.text = imageResult.desc
    }

    override fun initView() {
    }
}