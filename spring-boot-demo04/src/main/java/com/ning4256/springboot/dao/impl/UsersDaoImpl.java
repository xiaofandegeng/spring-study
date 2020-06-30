package com.ning4256.springboot.dao.impl;

import com.ning4256.springboot.dao.UsersDao;
import com.ning4256.springboot.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

    //查询全部用户
    @Override
    public List<Users> findUsersAll() {
        String sql = "select * from users";
        List<Users> list = jdbcTemplate.query(sql, new RowMapper<Users>() {

            @Override
            public Users mapRow(ResultSet resultSet, int i) throws SQLException {
                Users users = new Users();
                users.setUserid(resultSet.getInt("userid"));
                users.setUsername(resultSet.getString("username"));
                users.setUsersex(resultSet.getString("usersex"));
                return users;
            }
        });
        return list;
    }

    @Override
    public Users selectUserById(Integer id) {
        Users user = new Users();
        String sql = "select * from users where userid = ?";
        Object[] arr = new Object[]{id};
        jdbcTemplate.query(sql, arr, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                user.setUserid(resultSet.getInt("userid"));
                user.setUsername(resultSet.getString("username"));
                user.setUsersex(resultSet.getString("usersex"));
            }
        });
        return user;
    }
}
