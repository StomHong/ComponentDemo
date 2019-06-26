package com.stomhong.libme;

import android.support.v4.app.Fragment;

import com.stomhong.service.MeService;

import io.github.prototypez.appjoint.core.ServiceProvider;

@ServiceProvider
public class MeServiceImpl implements MeService {

    @Override
    public Fragment getMeFragment() {
        return new MeFragment();
    }
}
