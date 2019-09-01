package com.example.doctors

import android.app.Activity
import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.example.doctors.root.ApplicationComponent
import com.example.doctors.root.ApplicationModule
import com.example.doctors.root.DaggerApplicationComponent
import com.example.doctors.util.data.MyVersioningHelper
import com.example.doctors.util.preferences.MyPreferencesHelper
import io.realm.Realm
import io.realm.RealmConfiguration
import timber.log.Timber
import uk.co.chrisjenx.calligraphy.CalligraphyConfig

class MyApplication :  MultiDexApplication(), Application.ActivityLifecycleCallbacks {

    private var mCurrentActivity: Activity? = null
    val myVersioning =  MyVersioningHelper()
     val component = DaggerApplicationComponent.builder()
        .applicationModule(ApplicationModule(this))
        .build()

    override  fun onCreate()
    {
        super.onCreate()
        // Dagger App Scope Component injection
        component.inject(this)
        //Realm
        Realm.init(this)
        val realmConfiguration = RealmConfiguration
            .Builder()
            .schemaVersion(myVersioning.REALM_SCHEMA_VERSION)
            .build()
        Realm.setDefaultConfiguration(realmConfiguration)

        // Fonts
        CalligraphyConfig.initDefault(
            CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Ubuntu-R.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()  )
        //Shared Preferences
        MyPreferencesHelper.setLastKey("", this)

    }

    fun getApplicationComponent(): ApplicationComponent {
        return component
    }

    /**
     * Enabling multidex support
     * https://developer.android.com/tools/building/multidex.html
     *
     * @param  base context
     */
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    /**
     * Checks if user has internet connectivity
     *
     * @return true if device is internet-connected
     */
    fun isOnline(): Boolean {
        val manager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val netInfo = manager.activeNetworkInfo
        return netInfo != null && netInfo.isConnectedOrConnecting
    }

    //=============================Other Activity LifeCycle functions=======================================//
    public override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle) {

    }

    override fun onActivityStarted(activity: Activity) {
        Timber.v("++ Activity %s Started ++", activity.javaClass.canonicalName)
        mCurrentActivity = activity
    }

    override fun onActivityResumed(activity: Activity) {
        Timber.v("++ Activity %s Resumed ++", activity.javaClass.canonicalName)
    }

    override fun onActivityPaused(activity: Activity) {
        Timber.v("++ Activity %s Paused ++", activity.javaClass.canonicalName)
    }

    override fun onActivityStopped(activity: Activity) {
        if (mCurrentActivity === activity) {
            mCurrentActivity = null
        }
        Timber.v("++ Activity %s Stopped ++", activity.javaClass.canonicalName)
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {

    }

    override fun onActivityDestroyed(activity: Activity) {
        Timber.v("++ Activity %s Destroyed ++", activity.javaClass.canonicalName)
    }


}