package com.mohammedfahadkaleem.ultimatetoast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by fahadkaleem on 2/3/18.
 */

public class UltimateToast {

    /** Default background color of the toast */
    private static final @ColorInt int DEFAULT_BACKGROUND_COLOR = Color.parseColor("#454545");

    /** Default text color for the toast */
    private static final @ColorInt int DEFAULT_TEXT_COLOR = Color.parseColor("#FFFFFF");

    /** Default background color for the success toast */
    private static final @ColorInt int DEFAULT_SUCCESS_COLOR = Color.parseColor("#388E3C");

    /** Default background color for the error toast */
    private static final @ColorInt int DEFAULT_ERROR_COLOR = Color.parseColor("#D32F2F");

    /** Default background color for the warning toast */
    private static final @ColorInt int DEFAULT_WARNING_COLOR = Color.parseColor("#F57C00");

    /** Default background shape for the toast */
    private static final int DEFAULT_SHAPE = R.drawable.default_shape;
    //private static final Drawable DEFAULT_SUCCESS_ICON = null;
    //private static final Drawable DEFAULT_ERROR_ICON = null;
    //private static final Drawable DEFAULT_WARNING_ICON = null;

    /** {@code true} to disable all the icons */
    private static final boolean DEFAULT_DISABLE_ICON = false;

    /** Default icon size in pixels */
    private static final int DEFAULT_ICON_SIZE = -1;

    /** Default text size in sp */
    private static final int DEFAULT_TEXT_SIZE = -1;

    /** Default font of the toast */
    private static final Typeface DEFAULT_FONT = null;

    /** Default background color for the toast */
    private static @ColorInt int defaultBackgroundColor = DEFAULT_BACKGROUND_COLOR;

    /** Default text color for the toast */
    private static @ColorInt int defaultTextColor = DEFAULT_TEXT_COLOR;

    /** {@code=true} to disable all icons of the toast */
    private static boolean disableIcon = DEFAULT_DISABLE_ICON;

    /** Default icon size */
    private static int iconSize = DEFAULT_ICON_SIZE;

    /** Default text size */
    private static int textSize = DEFAULT_TEXT_SIZE;

    /** Default font type of the toast */
    private static Typeface font = DEFAULT_FONT;

    /** Default background of the toast */
    private static int toastShape = DEFAULT_SHAPE;

    /** Setter method to set the toast shape for the toast */
    public static void setToastShape(int toastShape) {
        UltimateToast.toastShape = toastShape;
    }

    /** Setter method to set the default background color of the toast */
    public static void setDefaultBackgroundColor(int defaultBackgroundColor) {
        UltimateToast.defaultBackgroundColor = defaultBackgroundColor;
    }

    /** Setter method to set the default text color of the toast */
    public static void setDefaultTextColor(int defaultTextColor) {
        UltimateToast.defaultTextColor = defaultTextColor;
    }

    /** Setter method to disable icons of the toast */
    public static void setDisableIcon(boolean disableIcon) {
        UltimateToast.disableIcon = disableIcon;
    }

    /** Setter method to set the icon size of the toast */
    public static void setIconSize(int iconSize) {
        UltimateToast.iconSize = iconSize;
    }

    /** Setter method to set the text size of the toast */
    public static void setTextSize(int textSize) {
        UltimateToast.textSize = textSize;
    }

    /** Setter method to set the font type for the toast */
    public static void setFont(Typeface font) {
        UltimateToast.font = font;
    }

    /** This method resets all the customizations made to the default values */
    public static void reset(){
        defaultBackgroundColor = DEFAULT_BACKGROUND_COLOR;
        defaultTextColor = DEFAULT_TEXT_COLOR;
        disableIcon = DEFAULT_DISABLE_ICON;
        iconSize = DEFAULT_ICON_SIZE;
        textSize = DEFAULT_TEXT_SIZE;
        font = DEFAULT_FONT;
        toastShape = DEFAULT_SHAPE;
    }


    /** Make a standard toast that just contains a text view
     * The duration is set to {@link Toast#LENGTH_SHORT}
     * @param context - The context to be used, usually {@link android.app.Application} or {@link android.app.Activity} object
     * @param text - Text to display on the toast.
     * @return Toast with the supplied parameters, Use {@link Toast#show()} to display the toast.
     * */
    public static @NonNull Toast make(@NonNull Context context,@NonNull CharSequence text){
        return make(context,text,null,null,defaultTextColor,defaultBackgroundColor,Toast.LENGTH_SHORT,toastShape);
    }

    /*Default Toast with duration*/
    public static @NonNull Toast make(@NonNull Context context,@NonNull CharSequence text,@NonNull int duration){
        return make(context,text,null,null,defaultTextColor,defaultBackgroundColor,duration,toastShape);
    }

    /*Default Toast with icon*/
    public static @NonNull Toast make(@NonNull Context context,@NonNull CharSequence text,@NonNull Drawable icon){
        return make(context,text,icon,null,defaultTextColor,defaultBackgroundColor,Toast.LENGTH_SHORT,toastShape);
    }

    /*Default Toast with icon and duration*/
    public static @NonNull Toast make(@NonNull Context context,@NonNull CharSequence text,@NonNull Drawable icon, @NonNull int duration){
        return make(context,text,icon,null,defaultTextColor,defaultBackgroundColor,duration,toastShape);
    }

    /*Success Toast*/
    public static @NonNull Toast makeSuccess(@NonNull Context context, @NonNull CharSequence text){
        return make(context, text,
                ContextCompat.getDrawable(context, R.drawable.ic_check_black_24dp),null,
                DEFAULT_TEXT_COLOR,
                DEFAULT_SUCCESS_COLOR,Toast.LENGTH_SHORT, toastShape);
    }

    /*Success Toast with duration*/
    public static @NonNull Toast makeSuccess(@NonNull Context context, @NonNull CharSequence text, @NonNull int duration){
        return make(context, text,
                ContextCompat.getDrawable(context, R.drawable.ic_check_black_24dp),null,
                DEFAULT_TEXT_COLOR,
                DEFAULT_SUCCESS_COLOR,duration, toastShape);
    }

    /*Error Toast*/
    public static @NonNull Toast makeError(@NonNull Context context, @NonNull CharSequence text){
        return make(context, text,
                ContextCompat.getDrawable(context, R.drawable.ic_clear_black_24dp),null,
                DEFAULT_TEXT_COLOR,
                DEFAULT_ERROR_COLOR,Toast.LENGTH_SHORT, toastShape);
    }

    /*Error Toast with duration*/
    public static @NonNull Toast makeError(@NonNull Context context, @NonNull CharSequence text, @NonNull int duration){
        return make(context, text,
                ContextCompat.getDrawable(context, R.drawable.ic_clear_black_24dp),null,
                DEFAULT_TEXT_COLOR,
                DEFAULT_ERROR_COLOR,duration, toastShape);
    }


    /*Warning Toast*/
    public static @NonNull Toast makeWarning(@NonNull Context context, @NonNull CharSequence text){
        return make(context, text,
                ContextCompat.getDrawable(context, R.drawable.ic_pan_tool_black_24dp),null,
                DEFAULT_TEXT_COLOR,
                DEFAULT_WARNING_COLOR,Toast.LENGTH_SHORT, toastShape);
    }

    /*Warning Toast with duration*/
    public static @NonNull Toast makeWarning(@NonNull Context context, @NonNull CharSequence text, @NonNull int duration){
        return make(context, text, ContextCompat.getDrawable(context, R.drawable.ic_pan_tool_black_24dp),null,
                DEFAULT_TEXT_COLOR,
                DEFAULT_WARNING_COLOR,duration, toastShape);
    }

    /*Custom Toast with icon, text color, background color, duration*/
    public static @NonNull Toast make(@NonNull Context context, @Nullable CharSequence text,
                                      @Nullable Drawable icon, @ColorInt int textColor,
                                      @ColorInt int backgroundColor,int duration) {
        return make(context, text, icon,null, textColor, backgroundColor, duration,toastShape);
    }
    /*Custom Toast with icon, text color, background color, duration*/
    public static @NonNull Toast make(@NonNull Context context, @Nullable CharSequence text,
                                      @Nullable Drawable icon,@NonNull Drawable topRightIcon, @ColorInt int textColor,
                                      @ColorInt int backgroundColor,int duration) {
        return make(context, text, icon,topRightIcon, textColor, backgroundColor, duration,toastShape);
    }

    public static @NonNull Toast make(@NonNull Context context,
                                      @NonNull CharSequence text,
                                      @NonNull Drawable icon,
                                      @NonNull Drawable topRightIcon,
                                      @ColorInt int textColor,
                                      @ColorInt int backgroundColor,
                                      int duration,
                                      int toastShape){
        final Toast ultimateToast = new Toast(context);
        final View layout = LayoutInflater.from(context).inflate(R.layout.ultimate_toast_layout,new LinearLayout(context),false);
        final ImageView toast_icon = layout.findViewById(R.id.toast_icon);
        final ImageView toast_top_right_icon = layout.findViewById(R.id.toast_icon2);
        final TextView toast_text = layout.findViewById(R.id.toast_text);
        final LinearLayout linearLayout = layout.findViewById(R.id.toast_kind);

        linearLayout.setBackgroundResource(toastShape);

        linearLayout.setBackground(ContextCompat.getDrawable(context, toastShape));
        linearLayout.getBackground().setColorFilter(backgroundColor, PorterDuff.Mode.ADD);


        if(icon!=null && disableIcon==false){
            if(iconSize!=DEFAULT_ICON_SIZE){
                Log.d("LOL","ICON SIZE");
                toast_icon.getLayoutParams().width=iconSize;
                toast_icon.getLayoutParams().height=iconSize;
            }
            toast_icon.setImageDrawable(icon);
        }
        else {
            toast_icon.setVisibility(View.GONE);
        }

        if(topRightIcon!=null && disableIcon==false){
            if(iconSize!=DEFAULT_ICON_SIZE){
                Log.d("LOL","ICON SIZE");
                toast_icon.getLayoutParams().width=iconSize;
                toast_icon.getLayoutParams().height=iconSize;
            }
            toast_top_right_icon.setImageDrawable(topRightIcon);
        }
        else {
            toast_top_right_icon.setVisibility(View.GONE);
        }

        if(font!= null){
            toast_text.setTypeface(font);
        }
        if(textSize!=DEFAULT_TEXT_SIZE){
            toast_text.setTextSize(TypedValue.COMPLEX_UNIT_SP,textSize);
        }
        toast_text.setText(text);
        toast_text.setTextColor(textColor);



        ultimateToast.setDuration(duration);
        ultimateToast.setView(layout);
        return ultimateToast;
    }

}
