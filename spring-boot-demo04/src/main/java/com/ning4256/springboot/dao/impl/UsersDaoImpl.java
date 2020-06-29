package com.ning4256.springboot.dao.impl;

import com.ning4256.springboot.dao.UsersDao;
import com.ning4256.springboot.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//持久层
@Repository
public class UsersDaoImpl implements UsersDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加用户
    @Override
    public void insertUsers(Users users) {
        String sql = "insert into users (username,usersex) values(?,?)";
        int update = this.jdbcTemplate.update(sql, users.getUsername(), users.getUsersex());
        System.out.println(update);

    }
}
