package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;


    private static final String DESCRIPTION = "Test findByListName(): Find in Hibernate";
    public static final String LISTNAME = "Test name";

    @Test

    public void testFindByListName(){
    TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
    taskListDao.deleteAll();
    taskListDao.save(taskList);

        List<TaskList> findTask = taskListDao.findByListName(LISTNAME);
        System.out.println("--------------------------------");
        assertEquals(1, findTask.size());
        System.out.println("--------------------------------");


        int id = taskListDao.findByListName(LISTNAME).get(0).getId();
        taskListDao.deleteById(id);

    }

}
