package com.service.impl;

import com.dao.ActionMapper;
import com.entity.Action;
import com.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ActionService")
public class ActionServiceImpl implements ActionService {
    @Autowired
    private ActionMapper actionMapper;

    @Override
    public List<Action> getActionByUserId(int userId) {
        return actionMapper.getActionByUserId(userId);
    }

    @Override
    public Boolean insertAction(Action action) {
        return actionMapper.insertAction(action) > 0 ? true : false;
    }
}
