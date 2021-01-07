package com.shpun.behavior.chain;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 16:39
 */
public class Chain3 extends AbstractChain {

    @Override
    protected void apply(int i) {
        if (i < 3) {
            System.out.println("Chain3 error");
        } else{
            System.out.println("Chain3");
            if (this.next != null) {
                this.next.apply(i);
            }
        }
    }
}
