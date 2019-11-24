package com.example.doctors.ui.doctors

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.example.doctors.MyApplication

@Suppress("DEPRECATION")
abstract class DoctorsDagger : AppCompatActivity(){
    var component: DoctorsComponent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val app = application as MyApplication
        component = DaggerDoctorsComponent.builder()
                .doctorsModule(DoctorsModule(app))
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