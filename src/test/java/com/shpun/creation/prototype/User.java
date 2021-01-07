package com.shpun.creation.prototype;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 15:15
 */
public class User implements Cloneable {

    private String id;

    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
