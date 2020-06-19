package com.ning4256.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {

    @PostMapping("/fileupload")
    public String fileUpload(MultipartFile file) {
        System.out.println(file.getOriginalFilename());

        return "success";
    }
}
