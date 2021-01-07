package com.shpun.behavior.state;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 21:06
 */
public class EndState implements State {

    @Override
    public void doAction(Context context) {
        context.setState(this);
    }

    @Override
    public String toString() {
        return "end state";
    }
}
