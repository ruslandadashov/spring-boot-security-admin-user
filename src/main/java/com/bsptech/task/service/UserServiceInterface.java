package com.bsptech.task.service;

import com.bsptech.task.entities.User;
import java.util.List;
/**
 * @author ruslandadashov
 */
public interface UserServiceInterface {

    public User findUserById(int id);

    public List<User> getAll();

    int add(User u);

    boolean update(User u);

    int delete(int id);
}
