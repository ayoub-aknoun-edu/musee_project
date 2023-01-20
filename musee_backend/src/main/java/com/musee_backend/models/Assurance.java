package com.musee_backend.models;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Assurance {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero ;
    @Enumerated(EnumType.STRING)
    private TypesAssurance typesAssurance;
    @ManyToMany
    @JoinTable(name = "assurance_conditions",joinColumns = @JoinColumn(name="numero"),inverseJoinColumns = @JoinColumn(name="condution_id"))
    private Set<Condition> conditions;
}
