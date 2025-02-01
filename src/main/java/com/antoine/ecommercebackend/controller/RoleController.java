package com.antoine.ecommercebackend.controller;

import com.antoine.ecommercebackend.entity.Role;
import com.antoine.ecommercebackend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;
    @PostMapping({"/createRole"})
    public Role createRole(Role role){
        return roleService.createRole(role);
    }
}
