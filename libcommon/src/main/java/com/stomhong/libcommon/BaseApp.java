package com.stomhong.libcommon;

import android.app.Application;

public class BaseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ToastUtil.init(this);
    }
}