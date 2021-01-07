package com.shpun.behavior.iterator;

/**
 * @Description:
 *
 * 迭代器模式，统一迭代器接口遍历元素，使得使用相同的接口来遍历不同的集合
 *
 * @Author: sun
 * @Date: 2021/1/5 17:57
 */
public class Main {

    public static void main(String[] args) {
        UserContainer userContainer = new UserContainer(10);
        userContainer.add(new User("1"));
        userContainer.add(new User("2"));
        userContainer.add(new User("3"));

        for (Iterator iterator = userContainer.iterator(); iterator.hasNext();) {
            User user = (User)iterator.next();
            System.out.println(user);
        }
    }

}
