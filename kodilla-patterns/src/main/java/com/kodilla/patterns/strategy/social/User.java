package com.kodilla.patterns.strategy.social;

public class User {

    String userName;
    protected  SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String sharePost() {
        return socialPublisher.share();
    }

      public void setShare(SocialPublisher socialPublisher){
        this.socialPublisher=socialPublisher;

    }
    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
