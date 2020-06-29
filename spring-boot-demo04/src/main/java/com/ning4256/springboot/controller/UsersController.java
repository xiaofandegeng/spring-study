package com.ning4256.springboot.controller;

import com.ning4256.springboot.pojo.Users;
import com.ning4256.springboot.service.UsersService;
import com.ning4256.springboot.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@Controller()
public class UsersController {

    //注入业务层
    @Autowired
    private UsersService usersService;


    @PostMapping("/user/addUser")
    public String addUser(Users users) {
        try {
            usersService.addUser(users);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "redirect:/OK";

    }
}
