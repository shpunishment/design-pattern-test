package com.shpun.behavior.chain;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 16:35
 */
public class Chain1 extends AbstractChain {

    @Override
    protected void apply(int i) {
        if (i < 1) {
            System.out.println("Chain1 error");
        } else{
            System.out.println("Chain1");
            if (this.next != null) {
                this.next.apply(i);
            }
        }
    }
}
