package com.example.doctors.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.example.doctors.MyApplication

@Suppress("DEPRECATION")
abstract class LoginDagger : AppCompatActivity(){
    var component: LoginComponent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val app = application as MyApplication
        component = DaggerLoginComponent.builder()
                .loginModule(LoginModule())
                .applicationComponent(app.component)
                .build()
        onInject()
    }

    abstract fun onInject()

    override fun onDestroy() {
        component = null
        super.onDestroy()
    }
}