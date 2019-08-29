package com.lz.githubdemo.service;

import com.lz.githubdemo.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lz
 * @Description
 * @Date 18:16 2019-08-27
 */
public interface IUserService {

     User getUser();

}
