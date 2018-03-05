package com.ssdk.project.model

/**
 * 登录
 * Created by zxt on 2018/1/15.
 */

interface LoginModel {
    fun login(name: String, pwd: String, onLoginResult: LoginModelImpl.OnLoginResult)
}
