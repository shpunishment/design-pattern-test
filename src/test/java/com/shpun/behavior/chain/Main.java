package com.shpun.behavior.chain;

/**
 * @Description:
 *
 * 责任链模式，形成链式关系，沿着链路传递，直到处理它为止
 *
 * @Author: sun
 * @Date: 2021/1/5 16:40
 */
public class Main {

    public static void main(String[] args) {
        AbstractChain chain1 = new Chain1();
        AbstractChain chain2 = new Chain2();
        AbstractChain chain3 = new Chain3();

        chain1.setNext(chain2);
        chain2.setNext(chain3);

        chain1.apply(2);
    }

}
