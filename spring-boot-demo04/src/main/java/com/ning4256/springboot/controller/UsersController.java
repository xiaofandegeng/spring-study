package com.ning4256.springboot.controller;

import com.ning4256.springboot.pojo.Users;
import com.ning4256.springboot.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller("/user")
public class UsersController {

    //注入业务层
    @Autowired
    private UsersService usersService;


    @PostMapping("/addUser")
    public String addUser(Users users) {


        return "redirect:OK";
    }
    //查询所有用户
    @GetMapping("/findUsersAll")
    public String findUsersAll(Model model) {
        try {
            List<Users> users = usersService.findUsersAll();
            model.addAttribute("users",users);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "showUsers";
    }

    //修改用户信息
    @GetMapping("/preUpdateUser")
    public String preUpdateUser(Integer id, Model model) {
        try {
            System.out.println("id:" + id);
            Users user = usersService.selectUserById(id);
            model.addAttribute("user",user);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "showUser";
    }
}
