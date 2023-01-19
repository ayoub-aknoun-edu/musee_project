package com.musee_backend.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@Entity
@AttributeOverride(name = "id",column = @Column(name="id"))
public class Guide extends Person{
}
