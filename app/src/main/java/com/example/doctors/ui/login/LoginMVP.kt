package com.example.doctors.ui.login

import android.view.View
import com.example.doctors.util.general.IView

interface LoginMVP {

    interface LoginView: IView {
    }

    interface Presenter {
        fun setPresenterView(view : View)
        fun login(email: String, password: String)


    }

    interface Model {
        fun login(email: String, password: String)
    }
}