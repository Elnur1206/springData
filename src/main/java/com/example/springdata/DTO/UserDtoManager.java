package com.example.springdata.DTO;

import com.example.springdata.entity.User;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class UserDtoManager implements Function<User, UserDto> {

    @Override
    public UserDto apply(User user) {
        return  new UserDto
                (user.getFullName(),user.getAge());
    }
}

