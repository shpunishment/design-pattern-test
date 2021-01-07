package com.shpun.behavior.memento;

/**
 * @Description: 存储的内部状态
 * @Author: sun
 * @Date: 2021/1/5 20:48
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
