package com.example.ssm.service.impl;

import com.example.ssm.dao.UserDao;
import com.example.ssm.entity.User;
import com.example.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ssm
 * @description: user service层实现类
 * @author: 尊尊
 * @create: 2018-10-07 23:24
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.insert(user);
    }

    @Override
    public User getUser(String id) {
        return userDao.selectByPrimaryKey(Integer.valueOf(id));
    }



}
