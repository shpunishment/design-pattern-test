package com.shpun.behavior.iterator;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 17:52
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
