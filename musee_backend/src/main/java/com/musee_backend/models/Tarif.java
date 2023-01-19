package com.musee_backend.models;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Tarif {
    @Id
    private String typeVisite;
    private long tarif;
}
