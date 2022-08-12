package com.news.NewsService.factory;

import com.news.NewsService.entity.Users;

public abstract class Factory {
    public static Users createUser(UserFactoryModel userFactoryModel) {
        Users user = new Users();
        user.setEmailId(userFactoryModel.getEmailId());
        user.setFirstName(userFactoryModel.getFirstName());
        user.setLastName(userFactoryModel.getLastName());
        user.setPassword(userFactoryModel.getPassword());
        return user;
    }
}
