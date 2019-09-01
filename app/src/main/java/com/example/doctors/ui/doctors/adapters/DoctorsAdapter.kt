package com.example.doctors.ui.doctors.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.doctors.R
import com.example.doctors.model.Doctor
import com.example.doctors.util.data.MyContentDataSource
import com.example.doctors.util.general.WindowUtils
import com.squareup.picasso.Picasso


class DoctorsAdapter  (val context: Context,  val data: ArrayList<Doctor>, val picasso: Picasso) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var inflater: LayoutInflater = LayoutInflater.from(context)

     override fun onCreateViewHolder(p0: ViewGroup, p1: Int): androidx.recyclerview.widget.RecyclerView.ViewHolder {
        val view = inflater.inflate(R.layout.doctor_item, p0, false)
        val holder = DoctorViewHolder(context, view)

        return holder
    }

    override fun getItemCount(): Int{
        return data.size
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        val current = data[p1]
        val mHolder = p0 as DoctorViewHolder
        mHolder.setValues(current!!)
    }

    inner class DoctorViewHolder(val context: Context, val view: View) : RecyclerView.ViewHolder(view) {

        val card_view_container: CardView = view.findViewById(R.id.card_view_container)
        val teaser_cover: ImageView = view.findViewById(R.id.teaser_cover)
        val doctor_cover: ImageView = view.findViewById(R.id.doctor_cover)
        val name: TextView = view.findViewById(R.id.name)
        val address: TextView = view.findViewById(R.id.address)

        fun setValues(doctor: Doctor) {
            name.text = doctor.getName()
            address.text = setAddressText(doctor.getName())
            orderTeaserCover()

            //Doctor cover  image

            picasso/*Picasso.get()*/ .load(MyContentDataSource.BASE_URL_DOCTORS_IMAGES + doctor.getId() + MyContentDataSource.BASE_URL_DOCTORS_IMAGES2 )
            .placeholder(R.drawable.doctor_image_place_holder_300x420)
            .into(doctor_cover)

        }

        private fun orderTeaserCover(){
            val p = WindowUtils.getScreenMetrics(card_view_container)
            val padding = calculateCardViewPadding()
            teaser_cover.layoutParams.width =
                (p.x - 2 * padding - 2 * WindowUtils.convertDpToPixel(8f, context)).toInt()
            teaser_cover.layoutParams.height =
                (teaser_cover.layoutParams.width / MyContentDataSource.TEASER_WIDTH_TO_HEIGHT_RATIO).toInt()
        }

        private fun calculateCardViewPadding(): Double{
            val elevation = WindowUtils.convertDpToPixel(8f, context)
            val radius = WindowUtils.convertDpToPixel(8f, context)
            val cos45 = Math.cos(Math.toRadians(45.0))
            val horizontalPadding = (elevation + (1 - cos45) * radius)
            return horizontalPadding

        }

        /**
         * derive a two lines string at most
         * @param address - abstract string
         * @return a string ending with a full word
         */
        private fun setAddressText(address: String?): String{
            var newAddress = ""
            address?.let{
                val length = address.length
                if (length > MyContentDataSource.MAX_ADDRESS_LENGTH) {
                    val tmpStr = address.substring(0, MyContentDataSource.MAX_ADDRESS_LENGTH)
                    newAddress = findFirstSpace(tmpStr)
                    return newAddress
                }
                return address   //shorter than MAX_ABSTRACT_SIZE
            }
            return ""
        }

        /**
         * locate the first space to prevent fragments of words
         * @param tmpStr - input string
         * @return a string ending with a full word
         */
        private fun findFirstSpace(tmpStr: String): String{
            val len = tmpStr.length
            var ch: Char = tmpStr[len - 1]
            var count = 0
            while (ch != ' '){
                count++
                ch = tmpStr[len - 1 - count]
            }
            return String.format("%s%s",tmpStr.substring(0, len - count), "...")
        }
    }
}