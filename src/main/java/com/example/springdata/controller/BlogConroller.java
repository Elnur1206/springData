package com.example.springdata.controller;

import com.example.springdata.entity.Blog;
import com.example.springdata.manager.BlogManager;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/blogs")
public class BlogConroller {
    private final BlogManager blogManager;
    @GetMapping
public List<Blog> getAll(){
    return blogManager.getAll();
}
@GetMapping("/{id}")
public Blog getById(@PathVariable int id){
    return blogManager.getById( id);
}
@PostMapping
@ResponseStatus(code= HttpStatus.CREATED)
public void saveBlog(@RequestBody Blog blog){
    System.out.println(blog.getUser());
    blogManager.saveBlog(blog);
}
@DeleteMapping("/delete/{id}")
public void deleteById(@PathVariable int id){
    blogManager.deleteById(id);
}


}
