package com.stomhong.libcontacts;

import android.support.v4.app.Fragment;

import com.stomhong.service.ContactsService;

import io.github.prototypez.appjoint.core.ServiceProvider;

@ServiceProvider
public class ContactsServiceImpl implements ContactsService {

    @Override
    public Fragment getContactsFragment() {
        return new ContactsFragment();
    }
}
