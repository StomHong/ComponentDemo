package com.stomhong.componentdemo;

import com.stomhong.service.ChatsService;
import com.stomhong.service.ContactsService;
import com.stomhong.service.DiscoverService;
import com.stomhong.service.MeService;

import io.github.prototypez.appjoint.AppJoint;

/**
 * 在这里提供其它模块暴露的服务
 */
public class AppService {

    public static ChatsService chatsService = AppJoint.service(ChatsService.class);
    public static ContactsService contactsService = AppJoint.service(ContactsService.class);
    public static DiscoverService discoverService = AppJoint.service(DiscoverService.class);
    public static MeService meService = AppJoint.service(MeService.class);
}
