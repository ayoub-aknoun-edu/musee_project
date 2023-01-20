package com.musee_backend.models;


import lombok.*;

import javax.persistence.*;

@Getter @Setter @ToString
@AllArgsConstructor
@MappedSuperclass
@NoArgsConstructor
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column
    private String lastName;
    private String firstName ;
    private String adresse;

}

