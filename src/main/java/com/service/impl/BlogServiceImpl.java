package com.service.impl;

import com.dao.BlogMapper;
import com.entity.Blog;
import com.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BlogService")
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper;

    @Override
    public List<Blog> getAllBlog() {
        return blogMapper.getAllBlog();
    }

    @Override
    public Boolean insertBlog(Blog blog) {
        return blogMapper.insertBlog(blog) > 0 ? true : false;
    }
}
