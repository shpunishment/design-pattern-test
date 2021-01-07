package com.shpun.structure.facade;

import com.shpun.structure.proxy.UserService;
import com.shpun.structure.proxy.UserServiceImpl;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 16:19
 */
public class UserServiceFacade {

    private UserService userService;

    public UserServiceFacade() {
        this.userService = new UserServiceImpl();
    }

    public void run() {
        userService.getId();
        userService.getName();
    }

}
