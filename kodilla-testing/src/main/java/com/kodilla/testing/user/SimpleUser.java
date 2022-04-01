package com.kodilla.testing.user;

public class SimpleUser {
     String username;

    public String getRealName() {
        return realName;
    }

    String realName;
    public SimpleUser(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    public SimpleUser(String username, String realName){
        this.username=username;
        this.realName=realName;

    }

    }

