package com.musee_backend.controllers;


import com.musee_backend.models.*;
import com.musee_backend.repositories.ThemeRepository;
import lombok.AllArgsConstructor;
import com.musee_backend.services.AdminServicesImpl;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
        //@PreAuthorize("hasRole('ADMIN')")
@RequestMapping("/admin/dashboard")
@RestController
public class AdminController {

    private AdminServicesImpl adminServices;
    private final ThemeRepository themeRepository;


    // -- oeuvre --

    @PutMapping("oeuvre/{id}")
    public Oeuvre modifieOeuvre(@RequestBody LinkedHashMap<String,String> body, @PathVariable Long id){
        OeuvreCrObject oeuvre = new OeuvreCrObject(body.get("name"),TypeOeuvre.valueOf(body.get("type")),
                                            Long.parseLong(body.get("assuranceId")),
                                            Long.parseLong(body.get("artisteId")),
                                            Long.parseLong(body.get("themeId")),
                                            body.get("description"),body.get("imageLink"));
        return adminServices.modifyOeuvre(id,oeuvre);
    }

    @PostMapping("oeuvre")
    public Oeuvre createOeuvre(@RequestBody LinkedHashMap<String,String> body ){
            OeuvreCrObject oeuvre = new OeuvreCrObject(body.get("name"),
                                                        TypeOeuvre.valueOf(body.get("type")),
                                                        Long.parseLong(body.get("assuranceId")),
                                                        Long.parseLong(body.get("artisteId")),
                                                        Long.parseLong(body.get("themeId")),
                                                        body.get("description"),
                                                        body.get("imageLink"));
        return adminServices.createOeuvre(oeuvre);
    }
    @DeleteMapping("oeuvre/delete/{id}")
    public Boolean deleteOeuvre(@PathVariable Long id){
        return adminServices.deleteOeuvre(id);
    }

    @PostMapping("oeuvre/assurance")
    public Assurance createAssurance(@RequestBody LinkedHashMap<String,Object> body){
        Set<Condition> conditions =((List<Integer>) body.get("conditions"))
                                    .stream()
                                    .map(e -> adminServices.getCondition(Long.parseLong(e.toString()) ))
                                    .collect(Collectors.toSet());

         //List.of(body.get("conditions")).forEach(System.out::println);
        Assurance assurance = new Assurance(null,Enum.valueOf(TypesAssurance.class, (String) body.get("type")),conditions);
        return  adminServices.createAssurance(assurance);
    }

    @PostMapping("oeuvre/assurance/condition")
    public Condition createCondition(@RequestBody Condition condition){
        return  adminServices.createCondition(condition);
    }

//    @PostMapping("artiste")
//    public Artiste  createArtiste(@RequestParam("firstName") String firstName,
//                                  @RequestParam("lastName") String lastName,
//                                  @RequestParam("birthYear") String birthYear,
//                                  @RequestParam("deathYear") String deathYear,
//                                  @RequestParam("description") String description,
//                                  @RequestParam("image") MultipartFile image){
//        DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("yyyyMMdd");
//        Artiste newArtist = new Artiste();
//        newArtist.setFirstName(firstName);
//        newArtist.setLastName(lastName);
//        newArtist.setBirthYear(( LocalDate.parse(birthYear+"0101",dateFormatter)) );
//        newArtist.setDeathYear(LocalDate.parse(deathYear+"0101",dateFormatter));
//        newArtist.setDescription(description);
//
//        try {
//            newArtist.setImage(image.getBytes());
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//       return adminServices.createArtiste(newArtist);
//    }


    // -- Artiste --
@PostMapping("artiste")
public Artiste  createArtiste(@RequestBody LinkedHashMap<String,String> data){
    DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("yyyyMMdd");
    Artiste newArtist = new Artiste();
    newArtist.setFirstName( data.get("firstName"));
    newArtist.setLastName(data.get("lastName"));
    newArtist.setBirthYear(( LocalDate.parse(data.get("birthYear")+"0101",dateFormatter)) );
    newArtist.setDeathYear(LocalDate.parse(data.get("deathYear")+"0101",dateFormatter));
    newArtist.setDescription(data.get("description"));
    newArtist.setImageLink(data.get("imageLink"));

    return adminServices.createArtiste(newArtist);
}

    @PutMapping("artiste/modifie/{id}")
    public Artiste modifierArtiste(@PathVariable Long id,@RequestBody LinkedHashMap<String,String> data){
        DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("yyyyMMdd");
        Artiste newArtist = new Artiste();
        newArtist.setFirstName( data.get("firstName"));
        newArtist.setLastName(data.get("lastName"));
        newArtist.setBirthYear(( LocalDate.parse(data.get("birthYear")+"0101",dateFormatter)) );
        newArtist.setDeathYear(LocalDate.parse(data.get("deathYear")+"0101",dateFormatter));
        newArtist.setDescription(data.get("description"));
        newArtist.setImageLink(data.get("imageLink"));// hadi khesha thyyed
        return adminServices.modifyArtiste(id ,newArtist);
    }
    @DeleteMapping("artiste/delete/{id}")
    public Boolean deleteArtiste(@PathVariable Long id ){
        return adminServices.deleteArtiste(id);
    }


    // -- event --
    @PostMapping("event")
    public Event createEvent(@RequestBody LinkedHashMap<String, String> body){
        DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Event event = new Event();
        event.setTitle(body.get("name"));
        event.setTime(body.get("time"));
        event.setDate(LocalDate.parse(body.get("date"),dateFormatter) );
        event.setDescription( body.get("description"));
        event.setImageLink(body.get("imageLink"));
        return adminServices.createEvent(event);
    }
    @PutMapping("event/modifie/{id}")
    public Event modifieEvent(@PathVariable Long id,@RequestBody LinkedHashMap<String,String> body){
        DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Event event = new Event();
        event.setTitle(body.get("name"));
        event.setTime(body.get("time"));
        event.setDate(LocalDate.parse(body.get("date"),dateFormatter) );
        event.setDescription( body.get("description"));
        event.setImageLink(body.get("imageLink"));
        return  adminServices.modifieEvent(id,event);
    }
    @DeleteMapping("event/delete/{id}")
    public Boolean deleteEvent(@PathVariable Long id ){
        return adminServices.deleteEvent(id);
    }

    // -- manifistation --
    @PostMapping("manifistation")
    public Manifistation createManifistation(@RequestBody LinkedHashMap<String,String> body ){
        DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Manifistation manifistation = new Manifistation();
        manifistation.setName(body.get("name"));
        manifistation.setTime(body.get("time"));
        manifistation.setDate(LocalDate.parse(body.get("date"),dateFormatter) );
        manifistation.setDescription(body.get("description"));
        Theme theme = themeRepository.findThemeByTheme(body.get("theme")).orElse(null);
        theme = theme==null ? themeRepository.findById(1L).get():theme;
        manifistation.setTheme(theme);
        manifistation.setImageLink(body.get("imageLink"));
        return adminServices.createManifistation(manifistation);
    }
    @PutMapping("manifistation/modifier/{id}")
    public Manifistation modifieManifistation(@PathVariable Long id ,@RequestBody LinkedHashMap<String,String> body){
        DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Manifistation manifistation = new Manifistation();
        manifistation.setTime(body.get("time"));
        manifistation.setDate(LocalDate.parse(body.get("date"),dateFormatter) );
        manifistation.setDescription(body.get("description"));
        Theme theme = themeRepository.findThemeByTheme(body.get("theme")).orElse(null);
        theme = theme==null ? themeRepository.findById(1L).get():theme;
        manifistation.setTheme(theme);
        manifistation.setImageLink(body.get("imageLink"));
        return adminServices.modefieManifistation(id,manifistation);

    }

    @DeleteMapping("manifistation/delete/{id}")
    public Boolean deleteManifistation(@PathVariable Long id ){
        return adminServices.deleteManifistation(id);
    }

}
