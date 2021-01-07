package com.shpun.structure.proxy;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 15:22
 */
public class UserServiceImpl implements UserService {

    @Override
    public void getId() {
        System.out.println("id");
    }

    @Override
    public void getName() {
        System.out.println("name");
    }
}
