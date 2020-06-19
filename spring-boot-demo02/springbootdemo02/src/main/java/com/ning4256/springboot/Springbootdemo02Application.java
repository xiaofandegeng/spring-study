package com.ning4256.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//扫描@WebServlet端口
@ServletComponentScan

public class Springbootdemo02Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootdemo02Application.class, args);
    }

}
