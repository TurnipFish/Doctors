package com.example.doctors.ui.doctors

import com.example.doctors.model.Doctor
import com.example.doctors.model.MyRealmQueries
import com.example.doctors.ui.login.LoginMVP
import com.example.doctors.ui.login.helper.LoginHelper
import io.realm.RealmResults

class DoctorsModel : DoctorsMVP.Model {

    override fun fetchAllDoctors(): RealmResults<Doctor>? {
        return MyRealmQueries.fetchAllDoctors()
    }

    override  fun clearDoctors(){
        MyRealmQueries.clearDoctors()
    }
}