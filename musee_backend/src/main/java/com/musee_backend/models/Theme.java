package com.musee_backend.models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Entity

public class Theme {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;
    private  String theme;
}
