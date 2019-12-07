package com.example.springboothello.service;

import com.example.springboothello.domian.User;

import javax.servlet.http.HttpServletResponse;

public interface IUserService {
    User selectUser(User user);
}
