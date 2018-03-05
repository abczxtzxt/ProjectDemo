package com.ssdk.project.utils

import android.app.AlertDialog
import android.app.Dialog
import android.app.ProgressDialog
import android.content.Context

/**
 * Created by zxtzx on 2018/1/25.
 */

class ProgressUitls {

    fun alertDialog(context: Context, message: String, title: String) {
        var progress: AlertDialog.Builder = AlertDialog.Builder(context)
        progress.setTitle(title)
        progress.setMessage(message)
        progress.show()
    }

    fun progressDialog(context: Context, title: String, message: String) {
        var progressDialog = ProgressDialog.show(context, title, message)
        progressDialog.setCancelable(true)
        progressDialog.setCanceledOnTouchOutside(true)
    }

}
