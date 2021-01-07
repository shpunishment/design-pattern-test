package com.shpun.behavior.mediator;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 21:10
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMsg(String msg) {
        ChatRoom.showMsg(this, msg);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
