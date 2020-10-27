package com.controller;

import com.common.Result;
import com.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("api")
public class MainController {
    private Logger logger = Logger.getLogger(MainController.class);

    @Resource
    private UserService userService;

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    @ResponseBody
    public String check(HttpServletRequest request, HttpServletResponse response) {
        logger.info("MainController run");
        Result result = new Result();
        result.setMessage("SSM vue前后端框架搭建成功");
        return result.toJson();
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String doLogin(HttpServletRequest request) {
        logger.info("Login run");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        return null;
    }
}
