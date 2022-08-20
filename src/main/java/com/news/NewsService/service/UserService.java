package com.news.NewsService.service;

import com.news.NewsService.entity.Users;
import com.news.NewsService.factory.UserFactoryModel;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Users createUser(UserFactoryModel userFactoryModel);

    Optional<Users> findUserById(Long userId);

    void deleteUser(Long userId);

    List<Users> getAllUsers();

    Users updateUser(Users user);

    Users findUserByEmailId(String emailId);
}

