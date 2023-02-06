package com.musee_backend.repositories;


import com.musee_backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findUserByUsernameOrEmail(String username, String email);
    Optional<User> findUserByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);

}
