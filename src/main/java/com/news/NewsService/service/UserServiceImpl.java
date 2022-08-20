package com.news.NewsService.service;

import com.news.NewsService.entity.Users;
import com.news.NewsService.factory.Factory;
import com.news.NewsService.factory.UserFactoryModel;
import com.news.NewsService.repository.RolesRepository;
import com.news.NewsService.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RolesRepository rolesRepository;

    public Users createUser(UserFactoryModel userFactoryModel) {
        Users user = Factory.createUser(userFactoryModel);
        user.setRoles(rolesRepository.findById(userFactoryModel.getRoleId()).orElse(rolesRepository.findRoleByName("USER")));
        return userRepository.save(user);
    }

    public Users updateUser(Users user) {
        return userRepository.save(user);
    }
    public Optional<Users> findUserById(Long userId) {
        return userRepository.findById(userId);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users findUserByEmailId(String emailId) {
        return userRepository.getUserByEmailId(emailId);
    }
}

