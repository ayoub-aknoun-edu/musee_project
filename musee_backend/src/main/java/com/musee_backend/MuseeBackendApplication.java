package com.musee_backend;

import com.musee_backend.models.*;
import com.musee_backend.services.AccountServiceImpl;
import com.musee_backend.services.AdminServicesImpl;
import com.musee_backend.services.GeneralServeces;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@SpringBootApplication
public class MuseeBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuseeBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AccountServiceImpl accountService, AdminServicesImpl adminServices, GeneralServeces generalServeces){
        return args -> {
            accountService.createNewRole(new Role(null,RoleName.USER));
            accountService.createNewRole(new Role(null,RoleName.ADMIN));
//            accountService.createNewUser(new User(null,"ayoubaknoun","123UYIY1","ayoub.akno@gmail.com","ayoub","aknoun","95982775",new HashSet<>()));
//            accountService.addRoleToUser("ayoubaknoun",("ADMIN"));
//            accountService.addRoleToUser("ayoubaknoun","USER");

            for (int i = 0 ;i<4;i++) {
                String[] artisteFnames = {"Leonardo da Vinci", "Michelangelo", "Rembrandt", "Vermeer"};
                Random random = new Random();
                Artiste artist = new Artiste();
                artist.setLastName(artisteFnames[i]);
                artist.setFirstName("  ");
                artist.setAdresse("maroc de merdre");
                artist.setDeathYear(LocalDate.of(1000 + random.nextInt(1023), 01, 01));
                artist.setBirthYear(LocalDate.of(1000 + random.nextInt(1023), 01, 01));
                artist.setDescription("this man was a legend ");
                adminServices.createArtiste(artist);
                Condition condition1 = new Condition(null, "condition1");
                Condition condition2 = new Condition(null, "condition2");
                adminServices.createCondition(condition1);
                adminServices.createCondition(condition2);
                Assurance assurance = new Assurance(null, TypesAssurance.ASSURANCE_EPOSITION, Set.of(condition1, condition2));
                assurance = adminServices.createAssurance(assurance);
                Theme theme = adminServices.createTheme(new Theme(null, "Theme 1"));
                OeuvreCrObject oeuvreCrObject = new OeuvreCrObject("Fragonard", TypeOeuvre.SCULPTURE, generalServeces.getArtistByFLnames("  ",artisteFnames[i] ).getId(), assurance.getNumero(), theme.getId(), "The Starry Night is an oil on canvas painting tc sky and the thickly impastoed texture of the paint.", null);
                adminServices.createOeuvre(oeuvreCrObject);
                adminServices.createOeuvre(oeuvreCrObject);

                adminServices.createArtiste(artist);
                accountService.getUsers().forEach(System.out::println);
                generalServeces.getArtistes().forEach(System.out::println);
                Event event = new Event();
                event.setDate(LocalDate.of(1000 + random.nextInt(1023), 01, 01));
                event.setTime("10:00 - 18:00");
                event.setDescription("welcome to our event be sure will enjoy ");
                event.setImageLink(null);
                adminServices.createEvent(event);

                Manifistation manifistation = new Manifistation();
                manifistation.setDate(LocalDate.of(1000 + random.nextInt(1023), 01, 01));
                manifistation.setTime("10:00 - 18:00");
                manifistation.setDescription("welcome to our event be sure will enjoy ");
                manifistation.setImageLink(null);
                adminServices.createManifistation(manifistation);
            }
        };
    }
}
