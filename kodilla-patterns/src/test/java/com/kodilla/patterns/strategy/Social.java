package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.social.*;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Social {
@Test
void testDefaultSharingStrategies() {

    //Given
    User john = new Millenials( "John");
    User peter = new YGeneration("Peter");
    User kate = new ZGeneration("Kate");

    //When
    String result1 = john.sharePost();
    String result2 = peter.sharePost();
    String result3 = kate.sharePost();
    //Then
    Assert.assertEquals("Share on Twitter", result1);
    assertEquals("Share on Facebook", result2);
    assertEquals("Share on Snapchat", result3);
}
@Test
   void testIndividualSharingStrategy(){
        //Given
        User john = new Millenials( "John");
        john.setShare(new FacebookPublisher());
        String result1 = john.sharePost();
        //Then
        assertEquals("Share on Facebook", result1);




    }
}
