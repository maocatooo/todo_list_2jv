package com.todo_list.service.impl;

import com.todo_list.entity.User;
import com.todo_list.mapper.UserMapper;
import com.todo_list.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.todo_list.model.dot.CreateUserReq;

@Service
public class UserImpl implements IUser {
    @Autowired
    private UserMapper mp;

    public List<User> selectAllUser(){
        return mp.selectAllUser();
    }

    public int saveUser(CreateUserReq req){
        try {
            var user = this.toUser(req);
             mp.saveUser(user);
             return user.getId().intValue();
        } catch (RuntimeException e){
            System.out.println(e);
        }
        return 0;
    }

    private User toUser(CreateUserReq req){
        var user =  new User();
        user.setEmail(req.getEmail());
        user.setName(req.getName());
        user.setPassword(req.getPassword());
        user.setPhoneNumber(req.getPhoneNumber());
        return user;
    }

    private User login(CreateUserReq req){
        var user =  new User();
        user.setEmail(req.getEmail());
        user.setName(req.getName());
        user.setPassword(req.getPassword());
        user.setPhoneNumber(req.getPhoneNumber());
        return user;
    }

}
