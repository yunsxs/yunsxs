package com.service;

import com.entity.User;

public interface UserService {
    User getUserByNameAndPwd(String username, String password);
}
