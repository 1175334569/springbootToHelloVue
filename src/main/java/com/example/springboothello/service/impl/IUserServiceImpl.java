package com.example.springboothello.service.impl;

import com.example.springboothello.dao.UserMapping;
import com.example.springboothello.domian.User;
import com.example.springboothello.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Service
public class IUserServiceImpl implements IUserService {

    @Resource
    private UserMapping userMapping;

    @Override
    public User selectUser(User user) {
        return userMapping.selectUser(user);

    }
}
