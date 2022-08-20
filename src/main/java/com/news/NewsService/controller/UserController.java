package com.news.NewsService.controller;

import com.news.NewsService.entity.Users;
import com.news.NewsService.factory.UserFactoryModel;
import com.news.NewsService.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/addUser")
    public ResponseEntity<Users> createUser(@RequestBody UserFactoryModel userFactoryModel) {

        log.info("Inside controller create User");
        return new ResponseEntity<>(userService.createUser(userFactoryModel), HttpStatus.CREATED);
    }

    @PutMapping("/updateUser")
    public ResponseEntity<Users> updateUser(@RequestBody Users user) {
        return new ResponseEntity<>(userService.updateUser(user), HttpStatus.OK);
    }

    @DeleteMapping("/deleteUser/{uid}")
    public ResponseEntity<?> deleteUser(@PathVariable("uid") Long userId) {
        userService.deleteUser(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Users findUserById(@PathVariable("id") Long userId) {
        log.info("Inside controller findUserById");
        return userService.findUserById(userId).get();
    }

    @GetMapping("/getUserByEmail/{emailId}")
    public Users findUserByEmailId(@PathVariable("emailId") String emailId) {
        return userService.findUserByEmailId(emailId);
    }

}
