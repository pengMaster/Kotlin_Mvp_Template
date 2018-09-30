package com.king.kotlinmvp.net


class BaseResponse<T>(val code :Int,
                      val msg:String,
                      val data:T)