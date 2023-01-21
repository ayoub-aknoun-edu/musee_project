package com.musee_backend.repositories;

import com.musee_backend.models.Oeuvre;
import com.musee_backend.models.TypeOeuvre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface OeuvreReository extends JpaRepository<Oeuvre,Long> {
    List<Oeuvre> findOeuvresByType(TypeOeuvre type);
}
