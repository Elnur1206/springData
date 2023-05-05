package com.example.springdata.DTO;

import java.time.LocalDate;

public record UserDto(
        String name,
        LocalDate age) {

}
