package com.ning4256.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转controller
 */

@Controller
public class PageController {

    //页面跳转方法
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
