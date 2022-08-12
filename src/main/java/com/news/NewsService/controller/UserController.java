package com.news.NewsService.controller;

import com.news.NewsService.entity.Users;
import com.news.NewsService.factory.UserFactoryModel;
import com.news.NewsService.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public Users createUser(@RequestBody UserFactoryModel userFactoryModel) {
        log.info("Inside controller create User");
        return userService.createUser(userFactoryModel);
    }

    @DeleteMapping("/deleteUser/{uid}")
    public String deleteUser(@PathVariable("uid") Long userId) {
        return userService.deleteUser(userId);
    }

    @GetMapping("/{id}")
    public Users findUserById(@PathVariable("id") Long userId) {
        log.info("Inside controller findUserById");
        return userService.findUserById(userId).get();
    }

}
