package com.musee_backend.models;


import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AttributeOverride(name = "id", column= @Column(name="id"))
public class Artiste extends Person{

    @OneToMany(mappedBy = "proprietaire" ,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Oeuvre> Oeuvres;

}
