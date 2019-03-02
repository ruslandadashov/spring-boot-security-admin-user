package com.bsptech.task.dao;


import java.util.List;

import com.bsptech.task.entities.Task;
import com.bsptech.task.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ruslandadashov
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

    List<Task> findAllByUserId(User userId);

    Task findByUserId(User userId);
    
    Task findById(int id);
}
