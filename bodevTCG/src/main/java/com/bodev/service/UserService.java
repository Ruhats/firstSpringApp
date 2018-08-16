package com.bodev.service;

import java.util.List;

import com.bodev.entity.User;

public interface UserService {
    void add (User user);
    List<User> listUsers();
}
