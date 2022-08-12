package com.news.NewsService.controller;

import com.news.NewsService.entity.Roles;
import com.news.NewsService.entity.Users;
import com.news.NewsService.service.RolesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
@Slf4j
public class RolesController {

    @Autowired
    RolesService rolesService;

    @PostMapping("/addRole")
    public Roles createRoles(@RequestBody Roles role) {
        return rolesService.createRoles(role);
    }

    @GetMapping("/id/{rid}")
    public Roles findRoleById(@PathVariable("rid") Long roleId) {
        return rolesService.findRoleById(roleId).get();
    }

    @GetMapping("/name/{name}")
    public Roles findRoleByName(@PathVariable("name") String name) {
        return rolesService.findRoleByName(name).get();
    }

    @GetMapping("/getUsers/{id}")
    public List<Users> getUsersByRoleId(@PathVariable("id")Long roleId) {
        return rolesService.getUsersByRoleId(roleId);
    }

}
