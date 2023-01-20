package com.musee_backend.repositories;

import com.musee_backend.models.Conference;
import com.musee_backend.models.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferanceRepository extends JpaRepository<Conference,Long> {
}
