package com.king.kotlinmvp.mvp.model.bean

import java.io.Serializable

/**
 * <pre>
 *     author : Wp
 *     e-mail : 18141924293@163.com
 *     time   : 2018/09/19
 *     desc   : 图片结果
 *     version: 1.0
 * </pre>
 */
data class ImageResult(val name:String
                       ,val url:String
                       ,val desc:String
                       ,val extendOne:String) {
    override fun toString(): String {
        return "ImageResult(name='$name', url='$url', desc='$desc', extendOne='$extendOne')"
    }
}