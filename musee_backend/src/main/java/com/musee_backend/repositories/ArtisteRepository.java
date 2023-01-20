package com.musee_backend.repositories;

import com.musee_backend.models.Artiste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArtisteRepository extends JpaRepository<Artiste,Long> {
    Optional<Artiste> findByFirstNameAndLastName(String firstName,String lastName);
}

