package com.musee_backend.services;

import com.musee_backend.models.Role;
import com.musee_backend.models.User;

import java.util.List;

public interface AccountService {
    public Role createNewRole(Role role );
    public User createNewUser(User user);
    public  User findUserByUserName(String username);
    public User findUserById(String id);
    public boolean addRoleToUser(String username,String rolename);
    public List<User> getUsers();
    public User updateUser(String id, User user);
    public void deleteUser(String id);
}
