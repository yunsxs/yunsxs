package com.service.impl;

import com.dao.UserMapper;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByNameAndPwd(String username, String password) {
        User user = userMapper.selectUserByName(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    @Override
    public Boolean insertUser(User user) {
        return userMapper.insertUser(user) > 0 ? true : false;
    }

    @Override
    public Boolean isPhoneExist(String phoneNumber) {
        if (userMapper.selectUserByPhoneNumber(phoneNumber) != null) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateUserById(User user) {
        int changeNumber = userMapper.updateUser(user);
        return changeNumber > 0 ? true : false;
    }

    @Override
    public User getUserById(int userId) {
        return userMapper.selectUserById(userId);
    }
}
