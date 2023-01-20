package com.musee_backend.models;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class Conferencier extends Person{
    private String fonction;
}


