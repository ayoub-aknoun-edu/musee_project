package com.musee_backend.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Map;

@Getter
@Setter
@ToString
@Embeddable
public class ContactMap {

    @ElementCollection
    @CollectionTable(name = "musee_contacts", joinColumns = @JoinColumn(name = "musee_id"))
    @MapKeyColumn(name = "name")
    @Column(name = "value")
    private Map<String, String> contacts;
}