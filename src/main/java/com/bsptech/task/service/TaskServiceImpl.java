package com.bsptech.task.service;

import com.bsptech.task.dao.TaskRepository;
import com.bsptech.task.entities.Task;
import java.util.List;

import com.bsptech.task.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ruslandadashov
 */
@Service
@Transactional
public class TaskServiceImpl implements TaskServiceInterface {

    @Autowired
    public TaskRepository taskDao;

    @Override
    public List<Task> getAll() {
        List<Task> list = taskDao.findAll();
        return list;

    }

    @Override
    public int add(Task t) {
        taskDao.save(t);
        return t.getId();
    }

    @Override
    public boolean update(Task t) {
        taskDao.save(t);
        return true;
    }

    @Override
    public int delete(int id) {
        taskDao.deleteById(id);
        return id;
    }

    @Override
    public List<Task> findAllByUserId(User userId) {
        return taskDao.findAllByUserId(userId);
    }

    @Override
    public Task findByUserId(User userId) {
        return taskDao.findByUserId(userId);
    }
    
     @Override
    public Task findById(int id) {
        return taskDao.findById(id);
    }

}
