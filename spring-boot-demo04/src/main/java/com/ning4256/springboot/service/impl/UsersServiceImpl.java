package com.ning4256.springboot.service.impl;

import com.ning4256.springboot.dao.UsersDao;
import com.ning4256.springboot.dao.impl.UsersDaoImpl;
import com.ning4256.springboot.pojo.Users;
import com.ning4256.springboot.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//用户管理业务层
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Override
//    @Transactional//添加事务
    public void addUser(Users users) {
        usersDao.insertUsers(users);
    }
}
