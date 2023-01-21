package com.musee_backend.controllers;

import com.musee_backend.models.Artiste;
import com.musee_backend.models.Oeuvre;
import com.musee_backend.services.AdminServicesImpl;
import com.musee_backend.services.GeneralServecesImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.LinkedHashMap;
import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/")
public class GeneralController {
    private GeneralServecesImpl generalServeces;
    private AdminServicesImpl adminServices;


    @GetMapping ("home")
    public String home(){
        return "This is the home page ";
    }

    @GetMapping("artistes")
    public List<Artiste> getArtistes(){
        return generalServeces.getArtistes();
    }
    @GetMapping("oeuvres")
    public List<Oeuvre> getOeuvres(){
        return generalServeces.getOeuvres();
    }

    @GetMapping("oeuvres/{type}")
    public List<Oeuvre> getOeuvresType(@PathVariable("type") String type){
        return generalServeces.getOeuvreByType(type);
    }

    @GetMapping("oeuvresbyartiste")
    public  List<Oeuvre> getOeuvres_Artiste(@RequestBody LinkedHashMap<String,String> body){
       return generalServeces.getOeuvreByArtiste(body.get("firstName"),body.get("lastName"));
    }


}
