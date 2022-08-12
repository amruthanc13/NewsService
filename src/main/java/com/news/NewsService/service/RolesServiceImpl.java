package com.news.NewsService.service;

import com.news.NewsService.entity.Roles;
import com.news.NewsService.entity.Users;
import com.news.NewsService.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolesServiceImpl implements RolesService {
    @Autowired
    RolesRepository rolesRepository;

    public Optional<Roles> findRoleById(Long roleId) {
        return rolesRepository.findById(roleId);
    }

    public Optional<Roles> findRoleByName(String roleName) {
        return Optional.ofNullable(rolesRepository.findRoleByName(roleName.toUpperCase()));
    }

    public Roles createRoles(Roles role) {
        role.setName(role.getName().toUpperCase());
        return rolesRepository.save(role);
    }

    public String deleteRoleById(Long roleId) {
        rolesRepository.deleteById(roleId);
        return "Deleted";
    }

    public List<Users> getUsersByRoleId(Long roleId) {
        return rolesRepository.getUsersByRoleId(roleId);
    }

}
