package com.stomhong.libdiscover;

import com.stomhong.libcommon.BaseApp;

import io.github.prototypez.appjoint.core.ModuleSpec;

@ModuleSpec( priority = 1 ) //支持指定初始化的优先级
public class DiscoverApp extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
    }
}