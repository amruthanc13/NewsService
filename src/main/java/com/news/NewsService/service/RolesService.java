package com.news.NewsService.service;

import com.news.NewsService.entity.Roles;
import com.news.NewsService.entity.Users;

import java.util.List;
import java.util.Optional;

public interface RolesService {
    Optional<Roles> findRoleById(Long roleId);

    Optional<Roles> findRoleByName(String roleName);

    Roles createRoles(Roles role);

    String deleteRoleById(Long roleId);

    List<Users> getUsersByRoleId(Long roleId);
}
