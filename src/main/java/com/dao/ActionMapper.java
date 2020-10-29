package com.dao;

import com.entity.Action;

import java.util.List;

public interface ActionMapper {
    // 根据userId查找action
    List<Action> getActionByUserId(int userId);

    //    插入数据
    int insertAction(Action action);
}
