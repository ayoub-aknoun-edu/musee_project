package com.musee_backend.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(unique = true)
    private String username;
    @NotEmpty(message = "mot de passe est obligatoire")
    @Size(min = 6,max = 100 , message = "mot de passe doit avoir plus que 6 caractere ")
    private String password;
    @NotEmpty(message = "l'email est obligatoire")
    private String email;
    @NotEmpty(message = "le nom peut pas etre vide ")
    private String firstName;
    @NotEmpty(message = "le prenom peur pas etre vide ")
    private String lastName;
    private String phone;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles",joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name="role_id"))
    private Set<Role> roles ;
}
