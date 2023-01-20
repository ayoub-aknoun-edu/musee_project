package com.musee_backend.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Condition {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String condition;

}
