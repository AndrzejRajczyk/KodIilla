package com.kodilla.good.patterns.challenges.food;

public class Buyer {
    String name;
    String login;

    public Buyer(String name, String login) {
        this.name = name;
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
