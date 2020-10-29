package com.controller;

import com.common.Result;
import com.common.ResultStatus;
import com.entity.Photo;
import com.entity.User;
import com.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sun.tools.jconsole.JConsole;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

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

    //    登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Result doLogin(@RequestBody User user, Model model) {
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

    //    注册
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
            result = new Result(ResultStatus.SUCCESS, user);
            result.setMessage("注册成功");
        } else {
            result = new Result(ResultStatus.ERROR);
            result.setMessage("注册失败");
        }
        return result;
    }

    // 文件上传
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public Result onUpLoad(@RequestParam("file") MultipartFile file, HttpSession session) throws IOException {
        Result result = null;
        // 获取上传文件的名称
        String fileName = file.getOriginalFilename();
        // 生成uuid作为文件名称
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
        // 获得文件后缀名
        String suffixName = fileName.substring(fileName.indexOf(".") + 1);
        // 得到文件名
        String newName = uuid + "." + suffixName;
        // 获取上传文件的路径
         String path = session.getServletContext().getRealPath("uploadfiles") + File.separator + newName;
//        String path = "C:\\Users\\27325\\IdeaProjects\\yunsxs\\yunsxs_api\\src\\main\\webapp\\uploadfiles" + File.separator + newName;
        System.out.println(path);

        File uploadFile = new File(path);
        FileCopyUtils.copy(file.getBytes(), uploadFile);
        Photo photo = new Photo();
        photo.setPath("uploadfiles/" + newName);
        photo.setUrl("http://localhost:8081/yunsxs_api/uploadfiles/" + newName);
        result = new Result(ResultStatus.SUCCESS, photo);
        return result;
    }
}
