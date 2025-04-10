package com.example.myapp1.service;

import com.example.myapp1.model.User;

import java.util.List;

public interface UserService {
    User getUser(Integer id);

    List<User> getUsers();
}
