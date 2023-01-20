package com.musee_backend.repositories;

import com.musee_backend.models.Manifistation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManifistationRepository extends JpaRepository<Manifistation,Long> {
}
