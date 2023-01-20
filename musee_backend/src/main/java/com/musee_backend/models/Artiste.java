package com.musee_backend.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@AttributeOverride(name = "id", column= @Column(name="id"))
public class Artiste extends Person{

    @JsonIgnore
    @OneToMany(targetEntity = Oeuvre.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "ouver")
    private Set<Oeuvre> Oeuvres;

    @Override
    public String toString() {
        return super.toString().substring(0,super.toString().length()-2)+", oeuvres:"+this.getOeuvres();

    }
}
