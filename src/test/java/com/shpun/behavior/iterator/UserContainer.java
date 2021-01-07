package com.shpun.behavior.iterator;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 17:54
 */
public class UserContainer implements Container {

    private User[] users;

    private int last;

    public UserContainer(int size) {
        this.users = new User[size];
        this.last = 0;
    }

    public void add(User user) {
        this.users[this.last] = user;
        this.last++;
    }

    @Override
    public Iterator iterator() {
        return new UserIterator();
    }

    private class UserIterator implements Iterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            if (this.index > last) {
                return false;
            }
            return true;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return users[this.index++];
            }
            return null;
        }
    }

}
