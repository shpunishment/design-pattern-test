package com.shpun.behavior.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 20:55
 */
public class Caretaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void save(Memento memento) {
        this.mementoList.add(memento);
    }

    public Memento get(int i) {
        return this.mementoList.get(i);
    }

}
