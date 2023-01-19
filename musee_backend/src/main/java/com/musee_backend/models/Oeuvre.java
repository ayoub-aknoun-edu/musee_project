package com.musee_backend.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Oeuvre {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private TypeOeuvre type;
    @ManyToOne
    @JoinColumn(name = "Artiste_id")
    private Artiste proprietaire;
    @OneToOne
    @JoinColumn(name = "assurance_numero")
    private Assurance assurance;


}
