package com.musee_backend.repositories;

import com.musee_backend.models.Conferencier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferencierRepository extends JpaRepository<Conferencier,Long> {
}
