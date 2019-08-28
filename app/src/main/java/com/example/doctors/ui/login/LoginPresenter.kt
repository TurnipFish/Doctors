package com.example.doctors.ui.login

import android.view.View
import com.example.doctors.ui.login.helper.LoginHelper

class LoginPresenter(val loginModel: LoginModel, val loginHelper: LoginHelper): LoginMVP.Presenter {
    override fun setPresenterView(view: View) {
    }

    override fun login(email: String, password: String) {
        loginModel.login(email, password)
    }
}