package com.ssdk.project.view

/**
 * Created by zxtzx on 2018/1/15.
 */

interface LoginView {
    fun success(name: String, pwd: String)
    fun fail()
}
