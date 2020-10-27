package com.controller;

import com.common.Result;
import com.common.ResultStatus;
import com.entity.User;
import com.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
@RequestMapping("api")
public class MainController {
    private Logger logger = Logger.getLogger(MainController.class);

    @Resource
    private UserService userService;

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    @ResponseBody
    public Result check(HttpServletRequest request, HttpServletResponse response) {
        logger.info("MainController run");
        Result result = new Result();
        result.setMessage("SSM vue前后端框架搭建成功");
        return result;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Result doLogin(@RequestBody User user, Model model, HttpServletRequest request, HttpServletResponse response) {
        logger.info("Login run");
        User foundUser = userService.getUserByNameAndPwd(user.getUsername(), user.getPassword());
        Result result = null;
        if (foundUser != null) {
            result = new Result(ResultStatus.SUCCESS, foundUser);
            result.setMessage("登录成功");
        } else {
            result = new Result(ResultStatus.USER_NOT_EXISTS);
        }
        return result;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Result doRegister(@RequestBody User user, Model model) {
        Result result = null;
        // 在注册前判断手机号是否已经存在
        if (userService.isPhoneExist(user.getPhonenumber())) {
            result = new Result(ResultStatus.ERROR);
            result.setMessage("注册失败，该手机号已被注册");
            return result;
        }
        Boolean isInserted = userService.insertUser(user);
        if (isInserted) {
            result = new Result(ResultStatus.SUCCESS);
            result.setMessage("注册成功");
        } else {
            result = new Result(ResultStatus.ERROR);
            result.setMessage("注册失败");
        }
        return result;
    }
}
