package bitlab.askar.module2.lesson5;

import java.io.Serializable;

public class User implements Serializable {
    int id;
    String login;
    String password;
    String name;

    public User() {
    }

    public User(int id, String login, String password, String name) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
