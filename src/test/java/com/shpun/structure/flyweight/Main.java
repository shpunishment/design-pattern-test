package com.shpun.structure.flyweight;

/**
 * @Description:
 *
 * 享元模式，尽量复用已创建的对象
 *
 * @Author: sun
 * @Date: 2021/1/5 16:32
 */
public class Main {

    public static void main(String[] args) {
        User user1 = User.create("id1", "name1");
        System.out.println(user1);
        User user2 = User.create("id1", "name1");
        System.out.println(user2);
        User user3 = User.create("id3", "name3");
        System.out.println(user3);
    }

}
