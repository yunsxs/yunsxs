package com.controller;

import com.common.Result;
import com.common.ResultStatus;
import com.entity.Action;
import com.service.ActionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("api/action")
public class ActionController {
    @Resource
    private ActionService actionService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Result getActionByUserId(@RequestParam("userId")int userId){
        System.out.println(userId);
        Result result = null;
        List<Action> actionList = actionService.getActionByUserId(userId);
        result = new Result(ResultStatus.SUCCESS, actionList);
        return result;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Result insertAction(@RequestBody Action action){
        Result result = null;
        Boolean flag = actionService.insertAction(action);
        if(flag){
            result = new Result(ResultStatus.SUCCESS, action);
        }else {
            result = new Result(ResultStatus.ERROR);
        }
        return result;
    }
}
