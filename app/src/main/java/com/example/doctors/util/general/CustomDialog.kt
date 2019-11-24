package com.example.doctors.util.general

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import butterknife.BindView
import butterknife.ButterKnife
import com.example.doctors.R


class CustomDialog(mContext: Context): Dialog(mContext) {

    val dialogContext: CustomDialog = this
    @BindView(R.id.header) lateinit var header: TextView
    @BindView(R.id.message) lateinit var message: TextView
    @BindView(R.id.message2) lateinit var message2: TextView
    @BindView(R.id.message3) lateinit var message3: TextView
    @BindView(R.id.dialog_buttons_container) lateinit var dialog_buttons_container: RelativeLayout
    @BindView(R.id.ok) lateinit var ok: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //1. initialize fragment
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.custom_dialog)

        //2. Bind to butterknife
        ButterKnife.bind(this)                 //binding butterknife

        this.ok.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                dialogContext.dismiss()
            }
        })
    }

    fun setHeader(header: String){
        this.header.text = header
    }

    fun setHeaderVisibility(visibility: Int){
        this.header.visibility = visibility
    }

    fun setMessage(message: String){
        this.message.text = message
    }

    fun setMessage2(message: String){
        this.message2.text = message
    }

    fun setMessage3(message: String){
        this.message3.text = message
    }

    fun setMessageVisibility(visibility: Int){
        this.message.visibility = visibility
    }

    fun setMessage2Visibility(visibility: Int){
        this.message2.visibility = visibility
    }

    fun setMessage3Visibility(visibility: Int){
        this.message3.visibility = visibility
    }

    fun setOkText(okTxt: String){
        ok.text = okTxt
    }

    fun setOkTextColor(color: Int){
        ok.setTextColor(color)
    }



    fun setOkVisibility(visibility: Int){
        this.ok.visibility = visibility
    }


    fun setOkButtonNewListener(listener: View.OnClickListener){
        this.ok.setOnClickListener(listener)
    }

    fun setButtonsVisibility(visibility: Int){
        this.dialog_buttons_container.visibility = visibility
    }

    fun setOkButtonListener(listener: View.OnClickListener ){
        ok.setOnClickListener(listener)
    }


    fun setMessageClickListener(listener: View.OnClickListener){
        message.setOnClickListener(listener)
    }

    fun setMessage2ClickListener(listener: View.OnClickListener){
        message2.setOnClickListener(listener)
    }

    fun setMessage3ClickListener(listener: View.OnClickListener){
        message3.setOnClickListener(listener)
    }



    //for Brand details
    fun setDialogIssues(margin: Float, x: Int, y: Int, Height: Float, width: Float){
        val wmlp: WindowManager.LayoutParams  = this.window?.attributes!!
        wmlp.gravity = Gravity.TOP or Gravity.START
        if (margin > 0) {
            wmlp.x = x - (width / 2).toInt()
            wmlp.y = y - WindowUtils.convertDpToPixel(25f, context).toInt()
        } else {
            wmlp.x = x - (width / 2).toInt()
            wmlp.y = y - Height.toInt()
        }
    }

    //for Author details
    fun setDialogAuthors(margin: Float, x: Int, y: Int, Height: Float, width: Float){
        val wmlp: WindowManager.LayoutParams  = this.window?.attributes!!
        wmlp.gravity = Gravity.TOP or Gravity.START
        if (margin > 0) {
            wmlp.x = x - (width / 2).toInt()
            wmlp.y = y - WindowUtils.convertDpToPixel(25f, context).toInt()
        } else {
            wmlp.x = x - (width / 2).toInt()
            wmlp.y = y - Height.toInt()
        }
    }
    //for Collections
    fun setDialogLocationCollections(margin: Float, x: Int, y: Int, Height: Float, width: Float){
        val wmlp: WindowManager.LayoutParams  = this.window?.attributes!!
        wmlp.gravity = Gravity.TOP or Gravity.START
        if (margin > 0) {
            wmlp.x = x - (width / 2).toInt()
            wmlp.y = y - WindowUtils.convertDpToPixel(25f, context).toInt()
        } else {
            wmlp.x = x - (width / 2).toInt()
            wmlp.y = y - Height.toInt() - 200
        }
    }


}

