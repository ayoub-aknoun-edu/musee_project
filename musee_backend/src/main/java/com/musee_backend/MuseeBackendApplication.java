package com.musee_backend;

import com.musee_backend.models.Role;
import com.musee_backend.models.User;
import com.musee_backend.repositories.RoleRepo;
import com.musee_backend.repositories.UserRepo;
import com.musee_backend.services.AccountServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MuseeBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuseeBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AccountServiceImpl accountService){
        return args -> {
            accountService.createNewRole(new Role(null,"ADMIN"));
            accountService.createNewRole(new Role(null,"USER"));
            accountService.createNewUser(new User(null,"ayoubaknoun","123UYIY1","ayoub.akno@gmail.com","ayoub","aknoun","95982775",new HashSet<>()));
            accountService.addRoleToUser("ayoubaknoun","ADMIN");
            accountService.addRoleToUser("ayoubaknoun","USER");
            accountService.getUsers().forEach(System.out::println);

        };


    }
}
