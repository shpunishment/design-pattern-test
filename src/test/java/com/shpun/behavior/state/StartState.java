package com.shpun.behavior.state;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 21:03
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start state";
    }
}
