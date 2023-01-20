package com.musee_backend.models;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AttributeOverride(name = "id", column = @Column(name="id"))
public class Manifistation extends Evenement{


    @ManyToOne
    @JoinColumn(name = "theme_id")
    private Theme theme;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "manifistation_oeuvres",joinColumns = @JoinColumn(name="manifistation_id"),inverseJoinColumns = @JoinColumn(name="oeuvre_id"))
    private List<Oeuvre> oeuvres;
}
