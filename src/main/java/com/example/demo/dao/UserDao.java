package com.example.demo.dao;

import com.example.demo.entity.User;

import java.util.List;

public interface UserDao {
    int insert(User record);

    List<User> selectUsers();
}
