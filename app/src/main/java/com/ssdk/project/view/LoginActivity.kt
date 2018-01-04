package com.ssdk.project.view

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.ssdk.project.MainActivity


import com.ssdk.project.R
import com.ssdk.project.bean.UserBean
import com.ssdk.project.utils.SharedPreferenceUtil
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener({
            if (TextUtils.isEmpty(name.text)) {
                Toast.makeText(this, "请输入用户名", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (TextUtils.isEmpty(pwd.text)) {
                Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "login success！", Toast.LENGTH_SHORT).show()
            var userBean = UserBean(name.text.toString(), pwd.text.toString())
            SharedPreferenceUtil.put(this, "User", userBean)
            var user: UserBean? = SharedPreferenceUtil.get(this, "User", null) as UserBean?

            // var intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent(this, MainActivity::class.java))
        })
    }


}
