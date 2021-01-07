package com.shpun.creation.builder;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 15:10
 */
public class User {

    private String id;

    private String name;

    private User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String id;
        private String name;

        private UserBuilder(){}

        public UserBuilder id(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            return new User(this.id, this.name);
        }

    }

}
