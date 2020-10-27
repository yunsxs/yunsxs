package com.dao;

import com.entity.User;

public interface UserMapper {
    User selectUserByName(String username);
}
