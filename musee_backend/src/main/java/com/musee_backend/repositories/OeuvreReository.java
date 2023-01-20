package com.musee_backend.repositories;

import com.musee_backend.models.Oeuvre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OeuvreReository extends JpaRepository<Oeuvre,Long> {
}
