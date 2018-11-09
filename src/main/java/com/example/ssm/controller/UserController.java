package com.example.ssm.controller;

import com.example.ssm.entity.User;
import com.example.ssm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: ssm
 * @description: user的 controller
 * @author: 尊尊
 * @create: 2018-10-07 23:27
 **/
@RestController
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;

    /**
     * 保存user信息     * @param id     * @param name     * @param age
     */
    @RequestMapping("/set")
    public void set(String id, String name, int age) {
        User user = new User();
        user.setSex("女");
        user.setAddress("狠人");
        user.setUsername("渣渣辉");
        userService.save(user);
    }

    /**
     * 指定id的数据     * @param id     * @return
     */
    @RequestMapping("get/{id}")
    public User get(@PathVariable("id") String id) {
        User user = userService.getUser(id);
        return user;
    }



}
