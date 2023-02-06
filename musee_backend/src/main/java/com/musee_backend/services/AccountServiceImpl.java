package com.musee_backend.services;

import com.musee_backend.models.Role;
import com.musee_backend.models.RoleName;
import com.musee_backend.models.User;
import com.musee_backend.repositories.RoleRepository;
import com.musee_backend.repositories.UserRepository;
import javax.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

   private UserRepository userRepository;
   private RoleRepository roleRepository;
   private PasswordEncoder passwordEncoder;



    @Override
    public Role createNewRole(Role role) {
        Role roleExist = roleRepository.findRoleByName(role.getName()).orElse(null);
        if (roleExist!=null)
            throw new RuntimeException("Role already exist");
        else
            return roleRepository.save(role);
    }

    @Override
    public User createNewUser(User user) {
        User userExist = userRepository.findByUsername(user.getUsername()).orElse(null);
        if (userExist!=null)
            throw new RuntimeException("user already exist ");
        else {
            String newPassword = passwordEncoder.encode(user.getPassword());
            user.setPassword(newPassword);
            return userRepository.save(user);
        }
    }

    @Override
    public User findUserByUserName(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }

    @Override
    public User findUserById(String id) {
        Long userId = Long.parseLong(id);
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public boolean addRoleToUser(String username, String rolename) {
        User user = userRepository.findByUsername(username).orElse(null);
        Role role = roleRepository.findRoleByName(RoleName.valueOf(rolename)).orElse(null);
        if( user!=null && role != null ){
            if(user.getRoles().add(role)){
                userRepository.save(user);
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
        return userRepository.findAll();
    }

    @Override
    public User updateUser(String id, User user) {
        Long userId = Long.parseLong(id);
        User userExist = userRepository.findById(userId).orElse(null);
        if (userExist!=null) {
            userExist.setFirstName(user.getFirstName());
            userExist.setLastName(user.getLastName());
        return userRepository.save(userExist);
        }else throw new RuntimeException("user not found");
    }

    @Override
    public void deleteUser(String id) {
        Long userId = Long.parseLong(id );
        User userExist = userRepository.findById(userId).orElse(null);
        userExist.setRoles(null);
        userRepository.save(userExist);
        userRepository.delete(userExist);
    }
}
