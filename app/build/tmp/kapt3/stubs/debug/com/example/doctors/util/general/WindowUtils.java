package com.example.doctors.util.general;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/doctors/util/general/WindowUtils;", "", "()V", "ScreenFactory", "app_debug"})
public final class WindowUtils {
    private static int orientation;
    private static boolean block_synch;
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private static final int NUM_BOUQUETS = 10;
    private static final float SCALE_MIN = 0.1F;
    private static final float SCALE_MAX = 0.5F;
    public static final com.example.doctors.util.general.WindowUtils.ScreenFactory ScreenFactory = null;
    
    public WindowUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020&J\u000e\u0010\'\u001a\u00020(2\u0006\u0010#\u001a\u00020$J\u0010\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,J\u001e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\nJ\u001e\u00102\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00103\u001a\u00020\u00042\u0006\u00101\u001a\u00020\nJ\u0010\u00104\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\u001a\u00a8\u00065"}, d2 = {"Lcom/example/doctors/util/general/WindowUtils$ScreenFactory;", "", "()V", "HEIGHT", "", "getHEIGHT", "()I", "NUM_BOUQUETS", "getNUM_BOUQUETS", "SCALE_MAX", "", "getSCALE_MAX", "()F", "SCALE_MIN", "getSCALE_MIN", "WIDTH", "getWIDTH", "block_synch", "", "getBlock_synch", "()Z", "setBlock_synch", "(Z)V", "orientation", "getOrientation", "setOrientation", "(I)V", "convertDpToPixel", "dp", "context", "Landroid/content/Context;", "convertPixelsToDp", "px", "getScreenMetrics", "Landroid/graphics/Point;", "view", "Landroid/view/View;", "getTextWidth", "Landroid/widget/Button;", "getViewLocationOnTheScreen", "", "hideSoftKey", "", "v", "Landroid/widget/TextView;", "scaleToFitHeight", "Landroid/graphics/Bitmap;", "bitmap", "height", "factor", "scaleToFitWidth", "width", "showSoftKey", "app_debug"})
    public static final class ScreenFactory {
        
        public final int getOrientation() {
            return 0;
        }
        
        public final void setOrientation(int p0) {
        }
        
        public final boolean getBlock_synch() {
            return false;
        }
        
        public final void setBlock_synch(boolean p0) {
        }
        
        public final int getWIDTH() {
            return 0;
        }
        
        public final int getHEIGHT() {
            return 0;
        }
        
        public final int getNUM_BOUQUETS() {
            return 0;
        }
        
        public final float getSCALE_MIN() {
            return 0.0F;
        }
        
        public final float getSCALE_MAX() {
            return 0.0F;
        }
        
        /**
         * This method converts dp unit to equivalent pixels, depending on device density.
         *
         * @param view a View in the layout required for the context
         * @return A Point object consisting of the {width, height} size in pixels
         */
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Point getScreenMetrics(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            return null;
        }
        
        /**
         * This method converts dp unit to equivalent pixels, depending on device density.
         *
         * @param dp A value in dp (density independent pixels) unit. Which we need to convert into pixels
         * @param context Context to get resources and device specific display metrics
         * @return A float value to represent px equivalent to dp depending on device density
         */
        public final float convertDpToPixel(float dp, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0.0F;
        }
        
        /**
         * This method converts device specific pixels to density independent pixels.
         *
         * @param px A value in px (pixels) unit. Which we need to convert into db
         * @param context Context to get resources and device specific display metrics
         * @return A float value to represent dp equivalent to px value
         */
        public final float convertPixelsToDp(float px, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Bitmap scaleToFitWidth(@org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap bitmap, int width, float factor) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Bitmap scaleToFitHeight(@org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap bitmap, int height, float factor) {
            return null;
        }
        
        public final int getTextWidth(@org.jetbrains.annotations.NotNull()
        android.widget.Button view) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final int[] getViewLocationOnTheScreen(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            return null;
        }
        
        public final void hideSoftKey(@org.jetbrains.annotations.Nullable()
        android.widget.TextView v) {
        }
        
        public final void showSoftKey(@org.jetbrains.annotations.Nullable()
        android.widget.TextView v) {
        }
        
        private ScreenFactory() {
            super();
        }
    }
}