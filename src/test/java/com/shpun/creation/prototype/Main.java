package com.shpun.creation.prototype;

/**
 * @Description:
 *
 * 原型模式，根据原有对象复制一个新对象
 *
 * @Author: sun
 * @Date: 2021/1/5 15:16
 */
public class Main {

    public static void main(String[] args) throws Exception {
        User user = new User("1", "张三");
        User user2 = (User) user.clone();
    }

}
