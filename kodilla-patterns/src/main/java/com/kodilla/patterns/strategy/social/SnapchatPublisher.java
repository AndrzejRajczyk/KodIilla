package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher{

    public String share(){
        System.out.println("Share on Snapchat");
        return "Share on Snapchat";

    }
}
