package com.shpun.behavior.chain;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 16:39
 */
public class Chain2 extends AbstractChain {

    @Override
    protected void apply(int i) {
        if (i < 2) {
            System.out.println("Chain2 error");
        } else{
            System.out.println("Chain2");
            if (this.next != null) {
                this.next.apply(i);
            }
        }
    }
}
