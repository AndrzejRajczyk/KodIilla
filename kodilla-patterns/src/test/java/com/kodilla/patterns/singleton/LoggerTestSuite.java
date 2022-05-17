package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastlog(){
       //Given
       // String lastLog = "Example logs text";
        Logger logger;
        logger=Logger.INSTANCE;
        logger.log("Something");


        String result =logger.getLastLog();
        System.out.println(result);
      //  Logger logger = new Logger(lastLog);
      //  //When
     //  String result = logger.getLastLog();
       Assertions.assertEquals("Something", result);
    }
}
