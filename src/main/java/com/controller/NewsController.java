package com.controller;

import com.common.Result;
import com.common.ResultStatus;
import com.entity.News;
import com.entity.NewsType;
import com.service.NewsService;
import com.service.NewsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("api/news")
public class NewsController {
    @Resource
    private NewsService newsService;
    @Resource
    private NewsTypeService newsTypeService;

    @RequestMapping(value = "/getAllNews", method = RequestMethod.GET)
    @ResponseBody
    public Result getAllNews(){
        Result result = null;
        List<NewsType> newsList = newsTypeService.getAllNewsType();
        result = new Result(ResultStatus.SUCCESS, newsList);
        return result;
    }

}
