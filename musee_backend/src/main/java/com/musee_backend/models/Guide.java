package com.musee_backend.models;


import lombok.*;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@AttributeOverride(name = "id",column = @Column(name="id"))
public class Guide extends Person{
}
