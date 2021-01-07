package com.shpun.behavior.chain;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 16:35
 */
public abstract class AbstractChain {

    protected AbstractChain next;

    public void setNext(AbstractChain next) {
        this.next = next;
    }

    protected abstract void apply(int i);

}
