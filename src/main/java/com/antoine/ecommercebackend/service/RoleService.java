package com.antoine.ecommercebackend.service;

import com.antoine.ecommercebackend.dao.RoleDao;
import com.antoine.ecommercebackend.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;
    public Role createRole(Role role) {
        return roleDao.save(role);
    }
}
