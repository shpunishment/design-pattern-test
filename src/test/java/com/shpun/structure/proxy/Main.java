package com.shpun.structure.proxy;

/**
 * @Description:
 *
 * 代理模式，代理原有实现类，增强它的方法
 *
 * @Author: sun
 * @Date: 2021/1/5 15:24
 */
public class Main {

    public static void main(String[] args) {
        UserService userServiceProxy = new UserServiceProxy();
        userServiceProxy.getId();
        userServiceProxy.getName();
    }

}
