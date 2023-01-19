package com.musee_backend.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Map;

@Getter
@Setter
@Embeddable
public class ContactMap {

    @ElementCollection
    @CollectionTable(name = "musee_contacts", joinColumns = @JoinColumn(name = "musee_id"))
    @MapKeyColumn(name = "name")
    @Column(name = "value")
    private Map<String, String> contacts;
}