package com.controller;

import com.common.Result;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api")
public class MainController {
    private Logger logger = Logger.getLogger ( MainController.class );
    @RequestMapping("/check")
    @ResponseBody
    public Result check(){
        logger.info("MainController run");
        Result result = new Result();
        result.setMessage("SSM vue前后端框架搭建成功");
        return result;
    }
}
