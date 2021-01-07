package com.shpun.behavior.visitor;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 21:19
 */
public class Computer implements ComputerPart {

    private ComputerPart[] computerParts;

    public Computer() {
        this.computerParts = new ComputerPart[]{ new Keyboard(), new Mouse() };
    }

    @Override
    public void accept(ComputerVisitor visitor) {
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(visitor);
        }
        visitor.visitor(this);
    }
}
