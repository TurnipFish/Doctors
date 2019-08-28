package com.example.doctors.ui.doctors

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import butterknife.BindView
import butterknife.ButterKnife
import com.example.doctors.MyApplication
import com.example.doctors.R
import com.example.doctors.model.Doctor
import com.example.doctors.ui.doctors.adapters.DoctorsAdapter
import com.example.doctors.ui.doctors.helper.DoctorsHelper
import com.example.doctors.util.general.WindowUtils
import com.example.doctors.util.preferences.MyPreferencesHelper
import com.google.android.material.snackbar.Snackbar
import com.squareup.picasso.Picasso
import io.realm.RealmList
import io.realm.RealmResults
import javax.inject.Inject

class DoctorsActivity : DoctorsDagger(), DoctorsMVP.DoctorsView {

    val activity = this
    @BindView(R.id.swipeToRefresh_recyclerview) lateinit var swipeRefresh: SwipeRefreshLayout
    @BindView(R.id.header) lateinit var header: TextView
    @BindView(R.id. doctors_recycler_view) lateinit var doctors_recycler_view: RecyclerView
    @BindView(R.id.search_text) lateinit var search_text: EditText
    @BindView(R.id. search) lateinit var search: Button
    var page = 1
    val doctors: RealmList<Doctor>? = null
    val dynamicArray = ArrayList<Doctor>()
    val manager_rv = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
    var doctorsAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>? = null

    @Inject lateinit var doctorsPresenter : DoctorsPresenter
    @Inject lateinit var doctorsHelper: DoctorsHelper
    @Inject lateinit var picasso: Picasso

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctors)
        // Bind views
        val unbinder = ButterKnife.bind(this)

        doctorsHelper.setContext(this)
        doctorsHelper.setView(search_text)
        initActionBar()
        initListeners()
    }

    override fun onInject() {
        component?.inject(this)
    }

    /**
     *  sets the action bar header
     */
    override fun initActionBar(){
        supportActionBar?.let{
            it.hide()
        }
        header.text = this.resources.getString(R.string.doctors_name)
    }

    /**
     *  sets listeners for views in the Activity
     */
    override fun  initListeners() {
        swipeRefresh.setOnRefreshListener { swipeRefresh.isRefreshing = false }

        //search text
        search.setOnClickListener {
            if ((application as MyApplication).isOnline()) {
                resetPage()                    //reset page
                commenceSearchOperation()
            } else {
                Snackbar.make(search_text, it.resources.getString(R.string.doctors_fetch_content_error), Snackbar.LENGTH_LONG).show()
            }
        }

        //check when scrolling is terinated
        doctors_recycler_view.addOnScrollListener(object: RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (!recyclerView.canScrollVertically(1)) {
                    if (MyPreferencesHelper.getLastKey(activity.application as MyApplication) != null) {
                        if ((application as MyApplication).isOnline()) {
                            commenceSearchOperation()
                        } else {
                            Snackbar.make(
                                search_text,
                                activity.resources.getString(R.string.doctors_fetch_content_error),
                                Snackbar.LENGTH_LONG
                            ).show()
                        }
                    }
                }
            }
        })
    }

    override fun initRecyclerView(){
        doctors_recycler_view.setItemViewCacheSize(40);
        doctors_recycler_view.setDrawingCacheEnabled(true);
        doctors_recycler_view.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH)
        val doctors = doctorsPresenter.fetchAllDoctors()
        val previousSize = dynamicArray.size
        doctors?.let{dynamicArray.addAll(doctors.subList(previousSize, doctors.size))}

        doctors?.let{
            if (page == 1) {
                doctorsAdapter = DoctorsAdapter(this, dynamicArray, picasso)
                setRecyclerView(doctorsAdapter!!, manager_rv)
            } else {

                doctorsAdapter?.notifyItemRangeInserted(previousSize, doctors.size)
                manager_rv.scrollToPositionWithOffset(previousSize-1, 0)
            }

            page += 1
        }
    }

    /**
     * creates a recyclerview
     */
    override fun setRecyclerView(viewAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>,
                                 viewManager: LinearLayoutManager ){
        doctors_recycler_view.apply {
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }

    /**
     * commence a search-for-doctors cycle against the server
     */
    override fun commenceSearchOperation(){
        val searchString = search_text.text.toString()
        if (searchString.length > 0) {
            swipeRefresh.isRefreshing = true
            val searchOptions = doctorsPresenter.deriveSearchOptions(search_text.text.toString())
            allocateSearchOptions(searchOptions)
        }
    }

    /**
     * Apply fetchDoctors according to the size of SearchOptions.
     * @param searchOptions - may coontain a name and/or location
     */
    override fun allocateSearchOptions(searchOptions: List<String>){
        when (searchOptions.size){
            1 -> {doctorsHelper.fetchDoctors(searchOptions[0], null)}
            else -> {doctorsHelper.fetchDoctors(searchOptions[0], searchOptions[1])}
        }
    }

    /**
     * reset view before a new search
     */
    override fun resetPage(){
        page = 1
        WindowUtils.hideSoftKey(header)
        doctors_recycler_view.adapter = null
        doctorsPresenter.clearDoctors()
    }

}
