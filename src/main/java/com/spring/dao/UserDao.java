package com.spring.dao;

import com.spring.entity.User;

public interface UserDao {

    public int insertUser(User user);

    public int deleteUser(User user);
}
