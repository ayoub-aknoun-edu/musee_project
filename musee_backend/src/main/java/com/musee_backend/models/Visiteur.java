package com.musee_backend.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AttributeOverride(name = "id", column= @Column(name="id"))
public class Visiteur extends Person{
}
