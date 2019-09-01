package com.example.doctors.ui.doctors

import com.example.doctors.model.Doctor
import com.example.doctors.model.MyRealmQueries
import io.realm.RealmResults

class DoctorsModel(val myRealmQueries: MyRealmQueries) : DoctorsMVP.Model {

    override fun fetchAllDoctors(): RealmResults<Doctor>? {
        return myRealmQueries.fetchAllDoctors()
    }

    override  fun clearDoctors(): Boolean{
        return myRealmQueries.clearDoctors()
    }
}