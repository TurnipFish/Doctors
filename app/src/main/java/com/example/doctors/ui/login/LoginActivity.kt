package com.example.doctors.ui.login

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatEditText
import butterknife.BindView
import butterknife.ButterKnife
import com.example.doctors.MyApplication
import com.example.doctors.R
import com.example.doctors.model.Doctor
import com.example.doctors.util.data.MyContentDataSource
import com.example.doctors.util.general.CustomDialog
import com.google.android.material.snackbar.Snackbar

import javax.inject.Inject

class LoginActivity : LoginDagger(), LoginMVP.LoginView {

    @BindView(R.id.header) lateinit var header: TextView
    @BindView(R.id.login) lateinit var login: Button
    @BindView(R.id.email) lateinit var email: AppCompatEditText
    @BindView(R.id.password) lateinit var password: AppCompatEditText
    @Inject lateinit var loginPresenter : LoginPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // Bind views
        val unbinder = ButterKnife.bind(this)
        loginPresenter.setPresenterView(this)
        loginPresenter.loginHelper.setContext(this)
        loginPresenter.loginHelper.setView(login)
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
        header.text = this.resources.getString(R.string.auth_name)
    }

    /**
     *  sets listeners for views in the Activity
     */
    override fun  initListeners(){
        login.setOnClickListener {
            if ((application as MyApplication).isOnline()) {
                //     loginPresenter.login(MyContentDataSource.USER_NAME, MyContentDataSource.USER_PASSWORD)
                val loginPermission: Boolean =
                    loginPresenter.checkCredentials(email.text.toString(), password.text.toString())

                if (loginPermission) {
                    loginPresenter.login(
                        MyContentDataSource.USER_NAME,
                        MyContentDataSource.USER_PASSWORD
                    )
                } else {
                    val dialog = CustomDialog(this)
                    dialog.show()
                    dialog.setHeader(this.resources.getString(R.string.auth_header))
                    dialog.setMessage(this.resources.getString(R.string.auth_message))
                }
            } else {
                Snackbar.make(login, this.resources.getString(R.string.network_offline),Snackbar.LENGTH_LONG).show()
            }

        }
    }


}
