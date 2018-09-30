package com.king.kotlinmvp.mvp.model.bean.parser;

import com.king.kotlinmvp.mvp.model.bean.ImageResult;

import java.util.HashSet;

/**
 * <pre>
 *     author : Wp
 *     e-mail : 18141924293@163.com
 *     time   : 2018/09/29
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class ImageListParser {

    private String code;
    private HashSet<ImageResult> result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public HashSet<ImageResult> getResult() {
        return result;
    }

    public void setResult(HashSet<ImageResult> result) {
        this.result = result;
    }
}
