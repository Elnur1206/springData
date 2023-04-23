package com.example.springdata.manager;

import com.example.springdata.entity.User;
import com.example.springdata.repository.UserRepository;
import com.example.springdata.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UserManager implements UserService {

    private final UserRepository userRepository;
    @Override
    public List<User> getAll() {

        return userRepository.findAll();
    }
    @Override
    public User getById(int id) {
        return userRepository.findById(id).get();

    }

    @Override
    public User saveUser(User u) {
        return userRepository.save(u);
    }
    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }
}
