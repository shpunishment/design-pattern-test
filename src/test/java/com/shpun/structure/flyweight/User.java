package com.shpun.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 16:28
 */
public class User {

    private String id;

    private String name;

    private static Map<String, User> cacheMap = new HashMap<>();

    private User(String id, String name){
        this.id = id;
        this.name = name;
    }

    public static User create(String id, String name) {
        String key = id + "#" + name;
        User user;
        if (cacheMap.containsKey(key)) {
            user = cacheMap.get(key);
        } else {
            user = new User(id, name);
            cacheMap.put(key, user);
        }
        return user;
    }

}
