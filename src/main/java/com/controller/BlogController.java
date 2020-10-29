package com.controller;

import com.common.Result;
import com.common.ResultStatus;
import com.entity.Blog;
import com.entity.User;
import com.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("api/blog")
public class BlogController {
    @Resource
    private BlogService blogService;

    @RequestMapping(value = "/getAllBlog", method = RequestMethod.GET)
    @ResponseBody
    public Result getAllBlog(){
        Result result =null;
        List<Blog> blogList = blogService.getAllBlog();
        result = new Result(ResultStatus.SUCCESS, blogList);
        return result;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    private Result insertBlog(@RequestBody Blog blog){
        Result result = null;
        Boolean flag = blogService.insertBlog(blog);
        if(flag){
            result = new Result(ResultStatus.SUCCESS, blog);
            result.setMessage("发布成功");
        }else {
            result = new Result(ResultStatus.ERROR);
            result.setMessage("发布失败");
        }
        return result;
    }
}
