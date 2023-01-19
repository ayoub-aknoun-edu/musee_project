package com.musee_backend.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Assurance {
    @Id
    private Long numero ;
    private TypesAssurance typesAssurance;
    @ManyToMany
    @JoinTable(name = "assurance_conditions",joinColumns = @JoinColumn(name="numero"),inverseJoinColumns = @JoinColumn(name="condution_id"))
    private Set<Condition> conditions;
}
