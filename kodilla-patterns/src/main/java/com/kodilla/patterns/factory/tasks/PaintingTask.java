package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
   private final  String taskName;
   private final  String color;
    private final String whatToPaint;
    private  boolean isTaskDone;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        isTaskDone = false;
    }
    @Override
    public void executeTask(){
        isTaskDone = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public boolean isTaskExecuted() {
        return isTaskDone;
    }
    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    public boolean isTaskDone() {
        return isTaskDone;
    }

    public void setTaskDone(boolean taskDone) {
        isTaskDone = taskDone;
    }
}
