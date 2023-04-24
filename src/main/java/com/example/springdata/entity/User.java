package com.example.springdata.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="istifadeciler")

public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="Ad")
    @JsonAlias(value="ad")
    private String fullName;

    @Column(name="dogum tarixi")
    private LocalDate age;

    @OneToMany(mappedBy = "user")
    List<Blog> blogs;


}
