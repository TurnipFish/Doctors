package com.example.doctors.util.general

import android.content.Context
import android.content.Intent
import android.view.View
import androidx.fragment.app.FragmentActivity
import com.example.doctors.ui.doctors.DoctorsActivity
import com.example.doctors.ui.doctors.DoctorsActivity_MembersInjector
import com.example.doctors.util.data.MyContentDataSource

open class DataFetchHelper: IDataFetchHelper {
    var ctx: FragmentActivity? = null
    var mView: View? = null


    override fun setContext(context: Context){
        this.ctx = context as FragmentActivity
    }

    override fun setView(view: View){
        this.mView = view
    }

    override fun checkStatusCode(statusCode: Int?): Boolean {
        when(statusCode) {
            MyContentDataSource.NETWORK_STATUS_ERROR -> {
                return false
            }

            MyContentDataSource.NETWORK_STATUS_OK -> {
                return true
            }
            else -> {
                return false
            }
        }

    }

    fun showDialog(header: String, msg: String){
        ctx?.let{
            val dialog = CustomDialog(ctx!!)
            dialog.show()
            dialog.setHeader(header)
            dialog.setMessage(msg)
        }
    }

     inline fun<reified  T : Context, reified R : Context> startNewActivity(clazz: Class<R>) {
        ctx?.let{
            val intent = Intent(ctx as T, clazz)
            it.startActivity(intent)

        }
    }


}