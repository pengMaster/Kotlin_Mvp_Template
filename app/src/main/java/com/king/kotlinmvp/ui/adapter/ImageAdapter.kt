package com.king.kotlinmvp.ui.adapter

import android.app.Activity
import android.content.Intent
import android.graphics.Typeface
import android.support.v7.widget.CardView
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.load.model.LazyHeaders
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.king.kotlinmvp.Constants
import com.king.kotlinmvp.MyApplication
import com.king.kotlinmvp.R
import com.king.kotlinmvp.glide.GlideApp
import com.king.kotlinmvp.mvp.model.bean.ImageResult
import com.king.kotlinmvp.ui.activity.ImageDetailActivity
import com.king.kotlinmvp.view.recyclerview.ViewHolder
import com.king.kotlinmvp.view.recyclerview.adapter.CommonAdapter

/**
 * <pre>
 *     author : Wp
 *     e-mail : 18141924293@163.com
 *     time   : 2018/09/29
 *     desc   : ImageAdapter
 *     version: 1.0
 * </pre>
 */

class ImageAdapter(mContext: Activity, categoryList: ArrayList<ImageResult>, layoutId: Int) :
        CommonAdapter<ImageResult>(mContext, categoryList, layoutId) {


    private var textTypeface: Typeface? = null

    init {
        textTypeface = Typeface.createFromAsset(MyApplication.context.assets, "fonts/FZLanTingHeiS-DB1-GB-Regular.TTF")
    }

    /**
     * 设置新数据
     */
    fun setData(categoryList: ArrayList<ImageResult>) {
        mData.clear()
        mData = categoryList
        notifyDataSetChanged()
    }

    fun addData(dataList: ArrayList<ImageResult>) {
        this.mData.addAll(dataList)
        notifyDataSetChanged()
    }
    /**
     * 绑定数据
     */
    override fun bindData(holder: ViewHolder, data: ImageResult, position: Int) {
        holder.setText(R.id.tv_hint, "#${data.desc}")
        //设置方正兰亭细黑简体
        holder.getView<TextView>(R.id.tv_hint).typeface = textTypeface

        holder.setImagePath(R.id.iv_image, object : ViewHolder.HolderImageLoader(data.url) {
            override fun loadImage(iv: ImageView, path: String) {
                GlideApp.with(mContext)
                        .load(GlideUrl(path, LazyHeaders.Builder().addHeader("Referer", "http://www.mzitu.com/").build()))
                        .placeholder(R.color.color_darker_gray)
                        .transition(DrawableTransitionOptions().crossFade())
                        .thumbnail(0.5f)
                        .into(iv)
            }
        })

        holder.setOnItemClickListener(View.OnClickListener {
            val intent = Intent(mContext as Activity, ImageDetailActivity::class.java)
            intent.putExtra(Constants.BUNDLE_IMAGE_DATA, data)
            mContext.startActivity(intent)
        })
        //动画
        val animation = AnimationUtils.loadAnimation(mContext, R.anim.translate_0_1)
        holder.getView<CardView>(R.id.mLayout).startAnimation(animation)
    }
}
