package com.shpun.behavior.visitor;

/**
 * @Description:
 *
 * 访问者模式，不区分元素，根据访问者不同信息返回相应的信息
 *
 *
 * @Author: sun
 * @Date: 2021/1/5 21:21
 */
public class Main {

    public static void main(String[] args) {
        ComputerPart compute = new Computer();
        compute.accept(new ComputerVisitor());
    }

}
