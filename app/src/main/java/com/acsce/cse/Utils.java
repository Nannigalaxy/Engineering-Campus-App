package com.acsce.cse;

import android.content.Context;
import android.view.View;

import androidx.core.content.ContextCompat;

import com.google.android.material.snackbar.Snackbar;

public class Utils {

    public static final String downloadDirectory = "CSE";
    public static final String mainUrl = "http://ngxapplications.c1.biz/storage/android/cse/";

    public static void showSnackBar(Context context, View view, String text) {
        Snackbar sb = Snackbar.make(view, text, Snackbar.LENGTH_LONG);
        sb.setTextColor(ContextCompat.getColor(context,R.color.secondary));
        sb.getView().setPadding(10,10,10,10);
        sb.setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        sb.setActionTextColor(ContextCompat.getColor(context,R.color.Cyan));
        sb.getView().setBackground(ContextCompat.getDrawable(context,R.drawable.snackbar_bg));
        sb.show();
    }

}
