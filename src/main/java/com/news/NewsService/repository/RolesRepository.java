package com.news.NewsService.repository;

import com.news.NewsService.entity.Roles;
import com.news.NewsService.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RolesRepository extends JpaRepository<Roles, Long> {

    @Query("SELECT r FROM Roles r WHERE r.name=:roleName")
    Roles findRoleByName(String roleName);

    @Query("SELECT r.users from Roles r WHERE r.roleId=:roleId")
    List<Users> getUsersByRoleId(Long roleId);
}
