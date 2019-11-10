package com.bozhongqun.cat.service.impl;

import com.bozhongqun.cat.mapper.UserMapper;
import com.bozhongqun.cat.entity.UserInfo;
import com.bozhongqun.cat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo getUserById(String userId) {

        return userMapper.getUserById(userId);
    }
}
