package org.lxk.dao;

import org.lxk.entity.User;

import java.util.List;

public interface UserDao {
    public void insert(User user);
    public User findUserById(int id);
    public List<User> findAllUsers();
}