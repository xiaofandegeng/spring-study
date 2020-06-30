package com.ning4256.springboot.dao;

import com.ning4256.springboot.pojo.Users;

import java.util.List;

//数据持久层
public interface UsersDao {

    void insertUsers(Users users);

    List<Users> findUsersAll();

    Users selectUserById(Integer id);
}
