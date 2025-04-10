package com.example.myapp1.dao;

import com.example.myapp1.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    User getUser(@Param("id") Integer id);

    List<User> getUsers();
}
