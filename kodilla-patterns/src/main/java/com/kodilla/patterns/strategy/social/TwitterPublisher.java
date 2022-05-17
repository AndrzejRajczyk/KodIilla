package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher{

    @Override
    public String share(){
        System.out.println("Share on Twitter");
         return "Share on Twitter";
    }

}
