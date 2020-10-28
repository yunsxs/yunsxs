package com.service;

import com.entity.User;

public interface UserService {
    User getUserByNameAndPwd(String username, String password);
    Boolean insertUser(User user);
    Boolean isPhoneExist(String phoneNumber);
    Boolean updateUserById(User user);
    User getUserById(int userId);
}
