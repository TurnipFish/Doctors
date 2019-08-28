package com.example.doctors.ui.login

import com.example.doctors.ui.login.LoginMVP
import com.example.doctors.ui.login.helper.LoginHelper

class LoginModel(val loginHelper: LoginHelper) : LoginMVP.Model {


    override fun login(email: String, password: String) {
        loginHelper.login(email, password)
    }


}