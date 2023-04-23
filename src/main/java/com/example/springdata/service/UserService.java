package com.example.springdata.service;

import com.example.springdata.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(int id);
    User saveUser(User u);
    void deleteById(int id);

}
