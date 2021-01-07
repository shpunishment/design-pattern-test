package com.shpun.behavior.visitor;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 21:18
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visitor(this);
    }
}
