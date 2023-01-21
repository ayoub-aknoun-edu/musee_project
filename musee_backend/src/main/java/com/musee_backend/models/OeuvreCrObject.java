package com.musee_backend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class OeuvreCrObject {
    private String name;
    private TypeOeuvre type;
    private Long assuranceId;
    private Long artisteId;
    private Long themeId;
}
