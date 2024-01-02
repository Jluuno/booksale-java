package com.jluuno.controller;

import com.jluuno.entity.User;
import com.jluuno.result.ResponseResult;
import com.jluuno.service.BookService;
import com.jluuno.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * (Book)表控制层
 *
 * @author makejava
 * @since 2023-12-17 22:26:32
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody User user){
        return userService.login(user);
    }

    @PostMapping("/register")
    public ResponseResult register(@RequestBody User user){
        return userService.register(user);
    }

    @GetMapping("/info")
    public ResponseResult getUserInfo(String userName){
        return userService.getUserInfo(userName);
    }

    @PutMapping("/update")
    public ResponseResult updateUserInfo(@RequestBody User user){
        return userService.updateUserInfo(user);
    }

}

