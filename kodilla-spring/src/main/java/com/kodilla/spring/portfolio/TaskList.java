package com.kodilla.spring.portfolio;

import java.util.List;

public class TaskList {
   private List<String> tasks;

    public TaskList(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }
    public void setSingleTask(String task){
        tasks.add(task);
    }

}
