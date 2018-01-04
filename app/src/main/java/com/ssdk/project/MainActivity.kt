package com.ssdk.project

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ssdk.project.bean.UserBean
import com.ssdk.project.utils.SharedPreferenceUtil
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var userBean: UserBean? = SharedPreferenceUtil.get(this, "User", null) as UserBean?
        userName.text = "欢迎" + (userBean?.name ?: "admin") + "登录成功"
    }


}

