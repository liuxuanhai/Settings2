package com.android.settings2;

import android.app.Application;

import com.socks.library.KLog;

/**
 * Created by Ronda on 2017/12/11.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        KLog.init(true, "Liu");

    }
}
