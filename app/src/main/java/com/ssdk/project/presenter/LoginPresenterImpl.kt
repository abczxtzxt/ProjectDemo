package com.ssdk.project.presenter

import com.ssdk.project.model.LoginModelImpl
import com.ssdk.project.view.LoginView


class LoginPresenterImpl(private val loginView: LoginView) : LoginPresenter {

    private val loginModel: LoginModelImpl

    init {
        this.loginModel = LoginModelImpl()
    }

    //登录
    override fun login(username: String, password: String) {
        loginModel.login(username, password, object : LoginModelImpl.OnLoginResult {
            override fun onSuccess() {
                loginView.success(username, password)
            }

            override fun onFail() {
                loginView.fail()
            }
        })
    }

}
