package com.example.doctors.ui.doctors

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doctors.model.Doctor
import com.example.doctors.util.general.IView
import io.realm.RealmResults

interface DoctorsMVP {

    interface DoctorsView: IView {
        fun initRecyclerView()
        fun setRecyclerView(viewAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>, viewManager: LinearLayoutManager)
        fun allocateSearchOptions(searchOptions: List<String>)
        fun commenceSearchOperation()
        fun resetPage()
    }

    interface Presenter {
        fun setPresenterView(view: DoctorsMVP.DoctorsView)
        fun deriveSearchOptions(searchText: String): List<String>
        fun fetchAllDoctors(): RealmResults<Doctor>?
        fun clearDoctors()
    }

    interface Model {
        fun fetchAllDoctors(): RealmResults<Doctor>?
        fun clearDoctors(): Boolean
    }
}