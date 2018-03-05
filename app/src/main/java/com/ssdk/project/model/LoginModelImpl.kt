package com.ssdk.project.model

import com.ssdk.project.Constants

/**
 * Created by zxt on 2018/1/15.
 */

class LoginModelImpl : LoginModel {

    override fun login(name: String, pwd: String, onLoginResult: OnLoginResult) {
        if (name == Constants.LOGIN_NAME && pwd == Constants.LOGIN_PWD) {
            onLoginResult.onSuccess()
        } else {
            onLoginResult.onFail()
        }
    }


    interface OnLoginResult {
        fun onSuccess()

        fun onFail()
    }

}
