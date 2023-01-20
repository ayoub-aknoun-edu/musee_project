package com.musee_backend.models;


import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.sql.Date;

@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Evenement {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Long id ;
    private Date date_evenment;
}
