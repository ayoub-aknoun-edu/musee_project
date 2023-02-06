package com.musee_backend.repositories;

import com.musee_backend.models.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ThemeRepository extends JpaRepository<Theme, Long> {
    Optional<Theme> findThemeByTheme(String theme);
}