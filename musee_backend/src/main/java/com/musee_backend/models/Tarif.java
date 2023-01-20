package com.musee_backend.models;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter @Setter @ToString
@Entity
public class Tarif {
    @Id
    private String typeVisite;
    private long tarif;
}
