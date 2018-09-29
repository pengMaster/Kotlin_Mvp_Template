package com.king.kotlinmvp.view.recyclerview.adapter

/**
 *
 * Description: Adapter条目的长按事件
 */
interface OnItemLongClickListener {

    fun onItemLongClick(obj: Any?, position: Int): Boolean

}
