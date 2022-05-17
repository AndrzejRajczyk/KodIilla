package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
   private final String taskName;
    private final String where;
    private final String using;
    private boolean isTaskDone;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        isTaskDone=false;

    }
    @Override
    public void executeTask(){
        isTaskDone = true;
    }
    @Override
    public boolean isTaskExecuted() {
        return isTaskDone;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    public boolean isTaskDone() {
        return isTaskDone;
    }

    public void setTaskDone(boolean taskDone) {
        isTaskDone = taskDone;
    }
}
