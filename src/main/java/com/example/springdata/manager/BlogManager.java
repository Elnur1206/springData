package com.example.springdata.manager;

import com.example.springdata.entity.Blog;
import com.example.springdata.repository.BlogRepository;
import com.example.springdata.service.BlogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class BlogManager implements BlogService {
    private final BlogRepository blogRepository;
    @Override
    public List<Blog> getAll() {
        return blogRepository.findAll();
    }
    @Override
    public Blog getById(int id) {
        return blogRepository.findById(id).get();
    }
    @Override
    public void saveBlog(Blog blog) {
       blogRepository.save(blog);
    }
    @Override
    public void deleteById(int id) {
      blogRepository.deleteById(id);
    }
}
