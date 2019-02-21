package com.liudong.ddweather.util;

import android.app.Application;

import android.content.Context;

import org.litepal.LitePalApplication;

public class UtilsApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePalApplication.initialize(context);
    }

    public static Context getContext() {
        return context;
    }
}
