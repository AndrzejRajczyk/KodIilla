package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("List1")
    TaskList listtodo;
    @Autowired
    @Qualifier("List2")
    TaskList inProgressList;
    @Autowired
    @Qualifier("List3")
    TaskList doneList;
    @Bean(name="List2")
    @Scope("prototype")
    public  TaskList createinProgressList(){
        return  new TaskList( new ArrayList<>());
    }
    @Bean(name="List1")
    @Scope("prototype")
    public  TaskList createtoDoList(){
        return  new TaskList( new ArrayList<>());
    }
    @Bean(name="List3")
    @Scope("prototype")
    public TaskList createdoneList(){return new TaskList(new ArrayList<>());}



    @Scope("prototype")
    public TaskList createTaskList(){
       return  new TaskList( new ArrayList<>());
    }

    @Bean
    @Scope("singleton")
    public Board createteBoard(){
        return new Board(listtodo,inProgressList,doneList); //toDoList, inProgressList, doneList
    }


}
