package com.service;

import com.entity.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> getAllBlog();
    Boolean insertBlog(Blog blog);
}
