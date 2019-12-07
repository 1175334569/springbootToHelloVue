package com.example.springboothello.controller;

import com.example.springboothello.domian.User;
import com.example.springboothello.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Controller
@CrossOrigin(origins = "*")
public class HelloController {

    @Resource
    private IUserService iUserService;

    @RequestMapping("/login")
    @ResponseBody
    public User test(@RequestBody User user,HttpServletResponse response){
         return  iUserService.selectUser(user);

    }
}
