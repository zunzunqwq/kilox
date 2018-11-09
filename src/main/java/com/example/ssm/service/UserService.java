package com.example.ssm.service;

import com.example.ssm.entity.User;

public interface UserService {
    void save(User user);

    User getUser(String id);


}
