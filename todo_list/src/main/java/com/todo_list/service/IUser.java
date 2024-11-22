package com.todo_list.service;

import com.todo_list.entity.User;
import com.todo_list.model.dot.CreateUserReq;

import java.util.List;

public interface IUser {
    List<User> selectAllUser();
    int saveUser(CreateUserReq req);
}
