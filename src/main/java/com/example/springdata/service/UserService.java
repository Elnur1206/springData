package com.example.springdata.service;

import com.example.springdata.DTO.UserDto;
import com.example.springdata.entity.User;

import java.util.List;

public interface UserService {
    List<UserDto> getAll();
    UserDto getById(int id);
    User saveUser(User u);
    void deleteById(int id);

}
