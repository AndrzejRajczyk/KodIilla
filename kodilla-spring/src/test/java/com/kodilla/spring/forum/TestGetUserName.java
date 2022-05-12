package com.kodilla;


import com.kodilla.spring.forum.ForumUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class TestGetUserName {

    @Test
    void testGetusername(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.forum") {
            @Override
            public Object getBean(String name) throws BeansException {
                return null;
            }
        };
        ForumUser forumUser = context.getBean(ForumUser.class);
        //When

        String name = forumUser.getUsername();
        //then
        Assertions.assertEquals("John Smith",name);
    }
}


