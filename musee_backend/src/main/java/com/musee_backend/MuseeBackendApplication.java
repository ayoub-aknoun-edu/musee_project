package com.musee_backend;

import com.musee_backend.models.*;
import com.musee_backend.services.AccountServiceImpl;
import com.musee_backend.services.AdminServicesImpl;
import com.musee_backend.services.GeneralServeces;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MuseeBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuseeBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AccountServiceImpl accountService, AdminServicesImpl adminServices, GeneralServeces generalServeces){
        return args -> {
            accountService.createNewRole(new Role(null,"ADMIN"));
            accountService.createNewRole(new Role(null,"USER"));
            accountService.createNewUser(new User(null,"ayoubaknoun","123UYIY1","ayoub.akno@gmail.com","ayoub","aknoun","95982775",new HashSet<>()));
            accountService.addRoleToUser("ayoubaknoun","ADMIN");
            accountService.addRoleToUser("ayoubaknoun","USER");
            Artiste artist = new Artiste();
            artist.setLastName("melodi");
            artist.setFirstName("adil");
            artist.setAdresse("maroc de merdre");
            adminServices.createArtiste(artist);
            Condition condition1= new Condition(null,"condition1");
            Condition condition2= new Condition(null,"condition2");
            adminServices.createCondition(condition1);
            adminServices.createCondition(condition2);
            Assurance assurance= new Assurance(null,TypesAssurance.ASSURANCE_EPOSITION, Set.of(condition1,condition2));
             assurance=adminServices.createAssurance(assurance);
            Theme theme = adminServices.createTheme(new Theme(null,"Theme 1"));
            OeuvreCrObject oeuvreCrObject= new OeuvreCrObject("Fragonard",TypeOeuvre.SCULPTURE,generalServeces.getArtistByFLnames("adil","melodi").getId(),assurance.getNumero(),theme.getId());
            adminServices.createOeuvre(oeuvreCrObject);
            adminServices.createArtiste(artist);
            accountService.getUsers().forEach(System.out::println);
            generalServeces.getArtistes().forEach(System.out::println);
        };


    }
}
