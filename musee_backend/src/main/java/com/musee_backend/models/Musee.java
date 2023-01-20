package com.musee_backend.models;


import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Musee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name;
    private String adresse ;
    private Date dateCreation;
    private Time timeOpen;
    private Time timeClose;
    @Embedded
    private ContactMap contacts ;

}
