package com.musee_backend.models;

import lombok.*;

import javax.persistence.*;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Oeuvre {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private TypeOeuvre type;
    @ManyToOne
    @JoinColumn(name = "artiste_id")
    private Artiste proprietaire;
    @OneToOne
    @JoinColumn(name = "assurance_numero")
    private Assurance assurance;

    @OneToOne
    @JoinColumn(name = "theme_id")
    private Theme theme;

}
