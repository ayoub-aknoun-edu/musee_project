package com.musee_backend.controllers;


import com.musee_backend.models.*;
import com.musee_backend.services.AdminServicesImpl;
import lombok.AllArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.Valid;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
@RequestMapping("/admin")
@RestController
public class AdminController {
    private AdminServicesImpl adminServices;
    @PutMapping("oeuvre/{id}")
    public Oeuvre modifieOeuvre(@RequestBody @Valid Oeuvre oeuvre, @PathVariable Long id){

        return adminServices.modifyOeuvre(id,oeuvre);
    }

    @PostMapping("oeuvre")
    public Oeuvre createOeuvre(@RequestBody OeuvreCrObject body){
        return adminServices.createOeuvre(body);
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

}
