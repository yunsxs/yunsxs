package com.service;

import com.entity.Action;

import java.util.List;

public interface ActionService {
    List<Action> getActionByUserId(int userId);
    Boolean insertAction(Action action);
}
