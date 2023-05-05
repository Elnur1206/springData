package com.example.springdata.manager;

import com.example.springdata.DTO.UserDto;
import com.example.springdata.DTO.UserDtoManager;
import com.example.springdata.entity.User;
import com.example.springdata.exception.UserNotFoundExceprion;
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
    private final UserDtoManager userDtoManager;
    @Override
    public List<UserDto> getAll() {
        return userRepository.findAll().stream().
                map(userDtoManager).toList();
    }
    @Override
    public UserDto getById(int id) {
        return userRepository.findById(id).
                stream().map(userDtoManager).findFirst().
                orElseThrow(()->new UserNotFoundExceprion("Istifadeci tapilmadi"));
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
