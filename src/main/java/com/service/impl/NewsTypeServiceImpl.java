package com.service.impl;

import com.dao.NewsTypeMapper;
import com.entity.NewsType;
import com.service.NewsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("NewsTypeService")
public class NewsTypeServiceImpl implements NewsTypeService {
    @Autowired
    private NewsTypeMapper newsTypeMapper;

    @Override
    public List<NewsType> getAllNewsType() {
        return newsTypeMapper.getAllNewsType();
    }
}
