package com.shpun.structure.proxy;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 15:22
 */
public class UserServiceProxy implements UserService {

    private UserService userService;

    public UserServiceProxy() {
        this.userService = new UserServiceImpl();
    }

    @Override
    public void getId() {
        System.out.println("before");
        this.userService.getId();
        System.out.println("after");
    }

    @Override
    public void getName() {
        System.out.println("before");
        this.userService.getName();
        System.out.println("after");
    }
}
