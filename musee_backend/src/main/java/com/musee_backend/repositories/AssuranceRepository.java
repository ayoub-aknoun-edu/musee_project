package com.musee_backend.repositories;

import com.musee_backend.models.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssuranceRepository extends JpaRepository<Assurance,Long> {
}
