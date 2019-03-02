package com.bsptech.task.service;

import com.bsptech.task.entities.Task;
import com.bsptech.task.entities.User;

import java.util.List;

/**
 * @author ruslandadashov
 */
public interface TaskServiceInterface {

    public List<Task> getAll();

    int add(Task t);

    boolean update(Task t);

    int delete(int id);

    List<Task> findAllByUserId(User userId);
    
    Task findByUserId(User userId);

    Task findById(int id);

}
