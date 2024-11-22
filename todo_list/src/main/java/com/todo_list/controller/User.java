package com.todo_list.controller;

import com.todo_list.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.todo_list.model.dot.*;
import java.util.List;

@RestController
public class User {
    @Autowired
    private IUser todoList;

    @GetMapping("/userList")
    public List<com.todo_list.entity.User> userList() {
       return todoList.selectAllUser();
    }
    @PostMapping("/createUser")
    public int createUser(@RequestBody CreateUserReq req) {
       return  todoList.saveUser(req);
    }

    @PostMapping("/login")
    public int login(@RequestBody LoginReq req) {
//        return  todoList.saveUser(req);
        return  0;
    }
}
