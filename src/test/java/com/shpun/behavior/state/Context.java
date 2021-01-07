package com.shpun.behavior.state;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 21:04
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
