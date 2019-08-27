package com.lz.githubdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lz
 * @Description
 * @Date 18:16 2019-08-27
 */
@RestController
public class UserController {

    @GetMapping
    public String getUser(){
        return "Mr.Liu";
    }

}
