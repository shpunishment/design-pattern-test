package com.shpun.behavior.mediator;

/**
 * @Description:
 *
 * 中介模式，提供一个中介类，将多边关系变成多个双边关系
 *
 * @Author: sun
 * @Date: 2021/1/5 21:13
 */
public class Main {

    public static void main(String[] args) {
        User user1 = new User("1");
        User user2 = new User("2");

        user1.sendMsg("111");
        user2.sendMsg("222");

    }

}
