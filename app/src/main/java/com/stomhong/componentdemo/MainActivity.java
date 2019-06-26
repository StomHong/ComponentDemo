package com.stomhong.componentdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;


public class MainActivity extends AppCompatActivity {

    FrameLayout mContainerFl;
    TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mContainerFl = findViewById(R.id.fl_container);
        mTabLayout = findViewById(R.id.tabLayout);
        mTabLayout.addTab(mTabLayout.newTab().setText("Chats"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Contacts"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Discover"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Me"));
        Fragment chatsFragment = AppService.chatsService.getChatsFragment();
        Fragment contactsFragment = AppService.contactsService.getContactsFragment();
        Fragment discoverFragment = AppService.discoverService.getDiscoverFragment();
        Fragment meFragment = AppService.meService.getMeFragment();
    }
}
