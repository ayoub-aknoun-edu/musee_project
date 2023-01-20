package com.musee_backend.controllers;

import com.musee_backend.models.Artiste;
import com.musee_backend.models.Oeuvre;
import com.musee_backend.repositories.ArtisteRepository;
import com.musee_backend.services.GeneralServeces;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/")
public class GeneralController {
    private GeneralServeces generalServeces;



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

}
