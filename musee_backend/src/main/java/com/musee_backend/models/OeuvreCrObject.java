package com.musee_backend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Lob;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class OeuvreCrObject {
    private String name;
    private TypeOeuvre type;
    private Long assuranceId;
    private Long artisteId;
    private Long themeId;
    private String description;

    private String imageLink ;
}
