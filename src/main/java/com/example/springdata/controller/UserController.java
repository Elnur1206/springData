package com.example.springdata.controller;

import com.example.springdata.entity.User;
import com.example.springdata.manager.UserManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserManager userManege;

    public UserController(UserManager userManege) {
        this.userManege = userManege;
    }
    @GetMapping
    public List<User> getAll(){
        return userManege.getAll();
    }
    @GetMapping("/{id}")
    public User getById(@PathVariable int id){
        return userManege.getById(id);
    }
    @PostMapping
    public void saveUser(@RequestBody User user){
        userManege.saveUser(user);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        userManege.deleteById(id);
    }
}
