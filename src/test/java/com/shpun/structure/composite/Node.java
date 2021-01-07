package com.shpun.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 *
 * 组合模式，表现在层次结构
 *
 * @Author: sun
 * @Date: 2021/1/5 16:22
 */
public class Node {

    private String name;

    private List<Node> nodeList;

    public Node(String name) {
        this.name = name;
        nodeList = new ArrayList<>();
    }

}
