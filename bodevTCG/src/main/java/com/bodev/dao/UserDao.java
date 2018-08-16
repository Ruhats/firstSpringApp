package com.bodev.dao;

import java.util.List;

import com.bodev.entity.User;

public interface UserDao {
    void add(User user);
    List<User> listUsers();
    User loadByUsername(String username);
}
