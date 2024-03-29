package com.kodilla.hibernate.task;

import com.kodilla.hibernate.tasklist.TaskList;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@NamedQueries({
        @NamedQuery(
                name = "Task.retrieveLongTasks",
                query = "FROM Task WHERE duration > 10"
        ),
        @NamedQuery(
                name = "Task.retrieveShortTasks",
                query = "FROM Task WHERE duration <= 10"
        )
})
@NamedNativeQuery(
        name = "Task.retrieveTasksWithEnoughTime",
        query = "SELECT * FROM TASKS" +
                " WHERE DATEDIFF(DATE_ADD(CREATED, INTERVAL DURATION DAY), NOW()) > 5",
        resultClass = Task.class
)
/*@NamedNativeQuery(
        name = "Task.retrieveTasksWithDurationLongerThan",
        query = "FROM Task WHERE duration>:DURATION"
)*/
@Entity
@Table(name = "TASKS")
public final class Task {

    private int id;
    private String description;
    private Date created;
    private int duration;
    TaskList taskList;

    private TaskFinancialDetails taskFinancialDetails;



    public Task(){}


    public Task(String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }


    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique=true)
    public int getId() {
        return id;
    }
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }
    @NotNull
    @Column(name = "CREATED")
    public Date getCreated() {
        return created;
    }
    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(Date created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }

    public void setId(int id) {this.id = id;}
@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
@JoinColumn(name = "TASKS_FINANCIALS_ID")
    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }
    @ManyToOne
    public TaskList getTaskList() { return taskList; }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
}