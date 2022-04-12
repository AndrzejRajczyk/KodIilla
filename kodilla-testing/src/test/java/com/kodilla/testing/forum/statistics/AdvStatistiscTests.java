package com.kodilla.testing.forum.statistics;


import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;





public class AdvStatistiscTests {
    Statistics statisticsMock = mock(Statistics.class);
    private static int testCounter=0;
    private List<String> listUsers(int number){
        List<String> users = new ArrayList<>();
        for(int n=0; n<number; n++){
            users.add(""+n);
        }
        return users;
    }
    @BeforeAll
    public static void beforeAllTest (){
        System.out.println("Forum Statistiscs Test begin....");
    }
    @AfterAll
    public static void afterAllTest(){
        System.out.println("Forum Statistiscs test ended....");
    }
    @BeforeEach
    public void beforeEachTest(){

        testCounter++;
        System.out.println("Begining test no: " + testCounter);
    }
    @AfterEach
    public void afterEachTest(){
            System.out.println("Ending test no: " + testCounter);
    }



    @Test
    void for0Users(){
        //When

        when(statisticsMock.usersNames()).thenReturn(listUsers(0));
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        listUsers(0);

        //Given
        assertEquals(0,advStatistics.averageCommentsPUsers);
        assertEquals(0,advStatistics.averagePostsPUsers);
        assertEquals(0,advStatistics.commentQuantity);
        assertEquals(0,advStatistics.usersQuantity);
        assertEquals(0,advStatistics.averageCommentsPPost);
    }

    @Test
       void for0Posts(){
        //When

        when(statisticsMock.postsCount()).thenReturn(0);
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then

        //Given
        assertEquals(0,advStatistics.averagePostsPUsers);
        assertEquals(0,advStatistics.commentQuantity);
        assertEquals(0,advStatistics.averageCommentsPPost);
        assertEquals(0, advStatistics.averageCommentsPUsers);
        assertEquals(0, advStatistics.postsQuantity);

    }
    @Test
    void for0Comments(){
        when(statisticsMock.commentsCount()).thenReturn(0);
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(0, advStatistics.averageCommentsPUsers);
        assertEquals(0,advStatistics.averageCommentsPPost);
        assertEquals(0, advStatistics.commentQuantity);

    }

    @Test
    void for100users1000Posts0Comments(){
       when(statisticsMock.usersNames()).thenReturn(listUsers(100));
       when(statisticsMock.postsCount()).thenReturn(1000);
       when(statisticsMock.commentsCount()).thenReturn(0);
       AdvStatistics advStatistics = new AdvStatistics();
       advStatistics.calculateAdvStatistics(statisticsMock);


        assertEquals(0,advStatistics.averageCommentsPUsers);
        assertEquals(10,advStatistics.averagePostsPUsers);
        assertEquals(0,advStatistics.commentQuantity);
        assertEquals(100,advStatistics.usersQuantity);
        assertEquals(0,advStatistics.averageCommentsPPost);
    }
    @Test
    void for100Users1000Posts100Comments(){
        when(statisticsMock.usersNames()).thenReturn(listUsers(100));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(1,advStatistics.averageCommentsPUsers);
        assertEquals(10,advStatistics.averagePostsPUsers);
        assertEquals(100,advStatistics.commentQuantity);
        assertEquals(100,advStatistics.usersQuantity);
        assertEquals(0.1,advStatistics.averageCommentsPPost,0.01);
        assertEquals(1000,advStatistics.postsQuantity);
    }
    @Test
    void for100Users100Posts1000Comments(){
        when(statisticsMock.usersNames()).thenReturn(listUsers(100));
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        AdvStatistics advStatistics = new AdvStatistics();
        advStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(10,advStatistics.averageCommentsPUsers);
        assertEquals(1,advStatistics.averagePostsPUsers);
        assertEquals(1000,advStatistics.commentQuantity);
        assertEquals(100,advStatistics.usersQuantity);
        assertEquals(10,advStatistics.averageCommentsPPost,0.01);
        assertEquals(100,advStatistics.postsQuantity);
    }


}
