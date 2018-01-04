package com.ssdk.project.bean

import android.support.annotation.Nullable
import java.io.Serializable

/**
 * Created by ssdk on 2017/12/17.
 */

class UserBean : Serializable {
    var name: String? = null
    var pwd: String? = null
    var sex: String? = null

    constructor(name: String?, pwd: String?) {
        this.name = name
        this.pwd = pwd

    }
}
