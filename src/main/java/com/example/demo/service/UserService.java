package com.example.demo.service;

import com.example.demo.entity.Role;
import com.example.demo.entity.AppUser;

import java.util.List;

public interface UserService {
    AppUser addUser(AppUser user);
    Role addRole(Role role);
    void addRoleToUser(String username, String roleName);
    List<AppUser> getUsers();
    AppUser getUser(String username);
}
