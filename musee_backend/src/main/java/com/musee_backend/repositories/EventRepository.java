package com.musee_backend.repositories;

import com.musee_backend.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventRepository extends JpaRepository<Event,Long> {

}
