package com.example.springdata.service;

import com.example.springdata.entity.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> getAll();
    Blog getById(int id);
    void saveBlog(Blog blog);
    void  deleteById(int id);


}
