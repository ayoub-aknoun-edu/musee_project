package com.musee_backend.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
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

    private Set<Oeuvre> Oeuvres;

    private String description;
    @JsonFormat(pattern = "yyyy")
    private LocalDate birthYear;
    @JsonFormat(pattern = "yyyy")

    private LocalDate deathYear;

    private String imageLink ;
    @Override
    public String toString() {
        return super.toString().substring(0,super.toString().length()-2)+", oeuvres:"+this.getOeuvres();

    }
}
