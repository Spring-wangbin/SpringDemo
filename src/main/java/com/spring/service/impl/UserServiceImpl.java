package com.spring.service.impl;

import com.spring.dao.impl.UserDao;
import com.spring.entity.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.insertUser(user);
        System.out.println("添加成功");
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
        System.out.println("删除成功");
    }
}
