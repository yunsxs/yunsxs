package com.dao;

import com.entity.User;

public interface UserMapper {
    User selectUserByName(String username);
    int insertUser(User user);
    User selectUserByPhoneNumber(String phoneNumber);
}
