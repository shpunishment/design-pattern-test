package com.shpun.behavior.template;

/**
 * @Description:
 *
 * 模板模式，定好的各个方法的执行顺序，具体实现有子类去完成
 *
 * @Author: sun
 * @Date: 2021/1/5 20:37
 */
public class Main {

    public static void main(String[] args) {
        Template template1 = new Template1();
        template1.run();

        Template template2 = new Template2();
        template2.run();
    }

}
