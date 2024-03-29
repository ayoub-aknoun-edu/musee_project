package com.musee_backend.repositories;

import com.musee_backend.models.Role;
import com.musee_backend.models.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findRoleByName(RoleName name);
}
