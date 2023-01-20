package com.musee_backend.models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@ToString
@Entity
@AttributeOverride(name = "id",column= @Column(name="id"))
public class Conference extends Evenement {
}
