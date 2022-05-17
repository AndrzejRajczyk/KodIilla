package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPING TASK";
    public static final String PAINTINGTASK = "PAINTING TASK";
    public static final String DRIVINGTASK = "DRIVING TASK";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Go to shop", "ladder", 1);
            case PAINTINGTASK:
                return new PaintingTask("Painting task one", "White", "Wall");
            case DRIVINGTASK:
                return new DrivingTask("Deliver", "Motorowa", "bicycle");
            default:
                return null;
        }
    }
}