package com.example.springboothello.dao;

import com.example.springboothello.domian.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapping {
    @Select("select * from user where username=#{username} and password=#{password}")
    User selectUser(User user);
}
