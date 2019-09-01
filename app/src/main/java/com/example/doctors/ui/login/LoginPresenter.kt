package com.example.doctors.ui.login

import android.view.View
import com.example.doctors.ui.login.helper.LoginHelper
import com.example.doctors.util.data.MyContentDataSource

class LoginPresenter(val loginModel: LoginModel, val loginHelper: LoginHelper): LoginMVP.Presenter {
    var view: LoginMVP.LoginView? = null

    override fun setPresenterView(view: LoginMVP.LoginView) {
        this.view = view
    }

    override fun checkCredentials(userName: String, password: String): Boolean{
        return (userName == MyContentDataSource.USER_NAME &&
                password == MyContentDataSource.USER_PASSWORD)
    }

    override fun login(userName: String, password: String) {
        loginModel.login(userName, password)
    }
}