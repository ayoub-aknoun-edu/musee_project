package com.musee_backend.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users",uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "username"
        }),
        @UniqueConstraint(columnNames = {
                "email"
        })
})
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @NotEmpty(message = "le nom peut pas etre vide ")
    private String firstName;
    @NotEmpty(message = "le prenom peur pas etre vide ")
    private String lastName;
    @Column(unique = true)
    private String username;
    @NotEmpty(message = "mot de passe est obligatoire")
    @Size(min = 6,max = 100 , message = "mot de passe doit avoir plus que 6 caractere ")
    private String password;
    @NotEmpty(message = "l'email est obligatoire")
    private String email;


//    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    @JoinTable(name = "users_roles",joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name="role_id"))
//    private Set<Role> roles ;
        @ManyToMany(fetch = FetchType.EAGER)
        @JoinTable(name = "user_roles",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
        private Set<Role> roles = new HashSet<>();

    public User(String firstName, String lastName, String username,String email ,String password ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
