package com.example.springdata.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="isrifadeciler")

public class Blog {
    @Id
    @GeneratedValue
    Integer id;
    @Column(name="blog basligi")
    String header;
    @Column(name="blog metni")
    String content;
    @ManyToOne(cascade = CascadeType.ALL)
     @JoinColumn(name="user_id",referencedColumnName = "id")
    User user;
}
