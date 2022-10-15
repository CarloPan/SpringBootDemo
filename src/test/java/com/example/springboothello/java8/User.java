package com.example.springboothello.java8;

import java.util.Objects;

public class User {
    String name;
    Integer num;
    long id;
    Object object;

/*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return num != null ? num.equals(user.num) : user.num == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }*/
}
