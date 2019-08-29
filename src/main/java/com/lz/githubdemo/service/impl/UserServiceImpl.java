package com.lz.githubdemo.service.impl;

import com.lz.githubdemo.dao.IUserDao;
import com.lz.githubdemo.domain.User;
import com.lz.githubdemo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author lz
 * @Description
 * @Date 18:16 2019-08-27
 */
@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

     @Override
     public User getUser(){
        /* User u = new User();
         u.setId(1);
         u.setName("Mr.Liu");
         u.setAge(21);
         u.setSex('0');*/

         return userDao.getUser();
     }

}
