package com.ssdk.project.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.ssdk.project.MainActivity
import com.ssdk.project.R
import com.ssdk.project.presenter.LoginPresenterImpl
import com.ssdk.project.utils.ProgressUitls
import com.ssdk.project.view.LoginView
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity(), LoginView {

    private val mHandler: Handler = Handler()

    private var loginPresenterImpl: LoginPresenterImpl? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginPresenterImpl = LoginPresenterImpl(this)
        btnLogin.setOnClickListener({
            showProgress()
            loginPresenterImpl!!.login(name.text.toString().trim(), pwd.text.toString().trim())
        })
    }


    override fun success(name: String, pwd: String) {
        mHandler.postDelayed({
            hideProgress()
            Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MainActivity::class.java)
                    .putExtra("name", name))
        }, 2000)


    }

    override fun fail() {
        hideProgress()
        Toast.makeText(this, "用户名或者密码错误！", Toast.LENGTH_SHORT).show()
    }


    fun hideProgress() {

    }

    fun showProgress() {
        ProgressUitls().progressDialog(this, "提示", "登录中")
    }
}
