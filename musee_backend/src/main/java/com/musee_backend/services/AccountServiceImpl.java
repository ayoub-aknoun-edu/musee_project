package com.musee_backend.services;

import com.musee_backend.models.Role;
import com.musee_backend.models.User;
import com.musee_backend.repositories.RoleRepo;
import com.musee_backend.repositories.UserRepo;
import javax.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

   private UserRepo userRepo;
   private RoleRepo roleRepo;
   private PasswordEncoder passwordEncoder;



    @Override
    public Role createNewRole(Role role) {
        Role roleExist = roleRepo.findRoleByName(role.getName()).orElse(null);
        if (roleExist!=null)
            throw new RuntimeException("Role already exist");
        else
            return roleRepo.save(role);
    }

    @Override
    public User createNewUser(User user) {
        User userExist = userRepo.findByUsername(user.getUsername()).orElse(null);
        if (userExist!=null)
            throw new RuntimeException("user already exist ");
        else {
        //    String newPassword = passwordEncoder.encode(user.getPassword());
         //   user.setPassword(newPassword);
            return userRepo.save(user);
        }
    }

    @Override
    public User findUserByUserName(String username) {
        return userRepo.findByUsername(username).orElse(null);
    }

    @Override
    public User findUserById(String id) {
        Long userId = Long.parseLong(id);
        return userRepo.findById(userId).orElse(null);
    }

    @Override
    public boolean addRoleToUser(String username, String rolename) {
        User user = userRepo.findByUsername(username).orElse(null);
        Role role = roleRepo.findRoleByName(rolename).orElse(null);
        if( user!=null && role != null ){
            if(user.getRoles().add(role)){
                userRepo.save(user);
                return true;
            }else {
                return false;
            }}
        else{
                return false;
        }
    }

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public User updateUser(String id, User user) {
        Long userId = Long.parseLong(id);
        User userExist = userRepo.findById(userId).orElse(null);
        if (userExist!=null) {
            userExist.setFirstName(user.getFirstName());
            userExist.setLastName(user.getLastName());
            userExist.setPhone(user.getPhone());
        return userRepo.save(userExist);
        }else throw new RuntimeException("user not found");
    }

    @Override
    public void deleteUser(String id) {
        Long userId = Long.parseLong(id );
        User userExist = userRepo.findById(userId).orElse(null);
        userExist.setRoles(null);
        userRepo.save(userExist);
        userRepo.delete(userExist);
    }
}
