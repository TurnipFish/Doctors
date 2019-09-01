package com.example.doctors.ui.doctors

import android.view.View
import com.example.doctors.model.Doctor
import com.example.doctors.util.data.MyContentDataSource
import io.realm.RealmResults

class DoctorsPresenter(val doctorsModel: DoctorsModel): DoctorsMVP.Presenter {
    override fun setPresenterView(view: View) {
    }

    override fun deriveSearchOptions(searchText: String): List<String>{
        val ary = searchText.split("/")
        return ary
    }

    override fun fetchAllDoctors(): RealmResults<Doctor>? {
        return doctorsModel.fetchAllDoctors()
    }

    override fun clearDoctors(){
        doctorsModel.clearDoctors()
    }



}