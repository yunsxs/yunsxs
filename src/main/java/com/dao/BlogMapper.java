package com.dao;

import com.entity.Blog;

import java.util.List;

public interface BlogMapper {
    List<Blog> getAllBlog();
    int insertBlog(Blog blog);
}
