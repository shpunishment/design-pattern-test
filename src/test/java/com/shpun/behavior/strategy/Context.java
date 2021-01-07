package com.shpun.behavior.strategy;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 20:43
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        this.strategy.execute();
    }

}
