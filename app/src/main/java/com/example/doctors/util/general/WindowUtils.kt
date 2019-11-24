package com.example.doctors.util.general
/**
 * @author  JackFlash 10-1-2018
 *
 **/
import android.content.Context
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Point
import android.graphics.Rect
import android.util.DisplayMetrics
import android.view.Display
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView

import io.realm.RealmObject
import java.util.*

class WindowUtils {

    companion object ScreenFactory{
        var orientation: Int = -1
        var block_synch: Boolean = false
        val WIDTH = 500;
        val HEIGHT = 500;
        val NUM_BOUQUETS = 10;
        val SCALE_MIN = 0.1f;
        val SCALE_MAX = 0.5f;
        /**
         * This method converts dp unit to equivalent pixels, depending on device density.
         *
         * @param view a View in the layout required for the context
         * @return A Point object consisting of the {width, height} size in pixels
         */
        fun getScreenMetrics(view: View): Point {
            val wm: WindowManager = view.context!!.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val display: Display = wm.defaultDisplay
            val point = Point()
            display.getSize(point)
            return point
        }

        /**
         * This method converts dp unit to equivalent pixels, depending on device density.
         *
         * @param dp A value in dp (density independent pixels) unit. Which we need to convert into pixels
         * @param context Context to get resources and device specific display metrics
         * @return A float value to represent px equivalent to dp depending on device density
         */
        fun convertDpToPixel(dp: Float, context: Context): Float{
            return dp * ( context.resources.displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT)
        }

        /**
         * This method converts device specific pixels to density independent pixels.
         *
         * @param px A value in px (pixels) unit. Which we need to convert into db
         * @param context Context to get resources and device specific display metrics
         * @return A float value to represent dp equivalent to px value
         */
        fun convertPixelsToDp(px: Float, context: Context ): Float{
            return px / (context.resources.displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT)
        }

        fun scaleToFitWidth(bitmap: Bitmap,  width: Int, factor: Float): Bitmap
        {
            return Bitmap.createScaledBitmap(bitmap, width, (bitmap.height * factor).toInt(), true);
        }


        fun scaleToFitHeight(bitmap: Bitmap,  height: Int, factor: Float): Bitmap
        {
            return Bitmap.createScaledBitmap(bitmap, (bitmap.width * factor).toInt(), height, true);
        }

        fun getTextWidth(view: Button): Int{
            val bounds = Rect()
            val textPaint = view.paint
            textPaint.getTextBounds(view.text.toString(), 0, view.text.toString().length, bounds)
            val width = bounds.width()
            return width
        }

        fun getViewLocationOnTheScreen(view: View): IntArray{
            intArrayOf(1,1)
            val viewLocation = IntArray(2) {0}
            view.getLocationOnScreen(viewLocation)
            return viewLocation
        }

        fun hideSoftKey(v: TextView?){
            val manager: InputMethodManager = v!!.context
                                              .getSystemService(Context.INPUT_METHOD_SERVICE)
                                              as InputMethodManager
            manager.hideSoftInputFromWindow(v.windowToken, 0)
        }

        fun showSoftKey(v: TextView?){
            val manager: InputMethodManager = v!!.context
                .getSystemService(Context.INPUT_METHOD_SERVICE)
                    as InputMethodManager
            manager.showSoftInput(v, 0)
        }
    }
}