package com.controller;

import com.common.Result;
import com.common.ResultStatus;
import com.entity.User;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("api/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    @ResponseBody
    public Result getUser(@RequestParam(name = "id") Integer id) {
        Result result = null;
        User user = userService.getUserById(id);
        if(user != null){
            result = new Result(ResultStatus.SUCCESS, user);
            result.setMessage("获取用户信息成功");
        }else {
            result = new Result(ResultStatus.ERROR);
            result.setMessage("获取用户信息失败");
        }
        return result;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Result updateUser(@RequestBody User user, Model model) {
        Result result = null;
//       判断手机号是否已经存在
        if (userService.isPhoneExist(user.getPhonenumber())) {
            // 存在则直接返回修改失败
            result = new Result(ResultStatus.ERROR);
            result.setMessage("修改失败，电话号码已存在！");
            return result;
        }
//        修改值
        if (userService.updateUserById(user)) {
            // 如果修改完成了，那么就返回修改后的值
            User updatedUser = userService.getUserById(user.getUserid());
            result = new Result(ResultStatus.SUCCESS, updatedUser);
            result.setMessage("修改用户成功");
        } else {
            result = new Result(ResultStatus.ERROR);
            result.setMessage("修改用户失败");
        }
        return result;
    }
}
