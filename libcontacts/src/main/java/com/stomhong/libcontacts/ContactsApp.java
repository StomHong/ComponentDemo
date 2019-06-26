package com.stomhong.libcontacts;

import com.stomhong.libcommon.BaseApp;

import io.github.prototypez.appjoint.core.ModuleSpec;

@ModuleSpec( priority = 2 ) //支持指定初始化的优先级
public class ContactsApp extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
    }
}