package com.musee_backend.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="roles")

public class Role {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private RoleName name ;
}
