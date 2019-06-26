package com.stomhong.libchats;

import android.support.v4.app.Fragment;

import com.stomhong.service.ChatsService;

import io.github.prototypez.appjoint.core.ServiceProvider;

@ServiceProvider
public class ChatsServiceImpl implements ChatsService {

    @Override
    public Fragment getChatsFragment() {
        return ChatsFragment.newInstance();
    }
}
