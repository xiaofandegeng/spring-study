package com.ning4256.springboot.service;

import com.ning4256.springboot.pojo.Users;

import java.util.List;

public interface UsersService {
    void addUser(Users users);

    List<Users> findUsersAll();

    Users selectUserById(Integer id);
}
