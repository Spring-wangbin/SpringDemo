package com.spring.dao.impl;

import com.spring.entity.User;

public interface UserDao {

    public int insertUser(User user);

    public int deleteUser(User user);
}
