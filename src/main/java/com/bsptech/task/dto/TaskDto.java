package com.bsptech.task.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author ruslandadashov
 */
public class TaskDto {

    private int id;
    private String title;
    private String description;
    private UserDto userId;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dueDate;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date finishDate;

    public TaskDto() {
    }

    public TaskDto(int id, String title, String description, UserDto userId, Date dueDate, Date finishDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.userId = userId;
        this.dueDate = dueDate;
        this.finishDate = finishDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserDto getUserId() {
        return userId;
    }

    public void setUserId(UserDto userId) {
        this.userId = userId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }
}
