package com.bsptech.task.dao;

import com.bsptech.task.entities.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * @author ruslandadashov
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public User findUserByUsername(String username);
}
