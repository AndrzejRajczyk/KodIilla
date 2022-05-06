package com.kodilla.good.patterns.challenges.allegro;

public class Buyer {
    String name;
    String surename;
    String loginName;
    String email;

    public Buyer(String name, String surename, String loginName, String email) {
        this.name = name;
        this.surename = surename;
        this.loginName = loginName;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", loginName='" + loginName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
