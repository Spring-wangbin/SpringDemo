package com.spring.dao.impl;

import com.spring.dao.UserDao;
import com.spring.entity.User;
import org.springframework.stereotype.Service;

public class UserDaoImpl implements UserDao {

    @Override
    public int insertUser(User user) {
        System.out.println("插入一个用户");
        return 0;
    }

    @Override
    public int deleteUser(User user) {
        System.out.println("删除一个用户");
        return 0;
    }
}
