package com.shpun.behavior.template;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 20:33
 */
public abstract class Template {

    public void run() {
        this.start();
        this.play();
        this.end();
    }

    protected abstract void start();

    protected abstract void play();

    protected abstract void end();

}
