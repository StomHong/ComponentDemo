package com.stomhong.libdiscover;

import android.support.v4.app.Fragment;

import com.stomhong.service.DiscoverService;

import io.github.prototypez.appjoint.core.ServiceProvider;

@ServiceProvider
public class DiscoverServiceImpl implements DiscoverService {

    @Override
    public Fragment getDiscoverFragment() {
        return new DiscoverFragment();
    }
}
