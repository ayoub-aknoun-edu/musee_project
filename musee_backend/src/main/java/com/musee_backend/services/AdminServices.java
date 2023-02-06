package com.musee_backend.services;

import com.musee_backend.models.*;
import org.hibernate.validator.internal.constraintvalidators.bv.number.bound.MaxValidatorForNumber;

import java.util.Date;
import java.util.HashMap;

public interface AdminServices {

    // --- oeuvre ----
    Oeuvre createOeuvre(OeuvreCrObject oeuvre);
    Oeuvre modifyOeuvre(Long id,OeuvreCrObject oeuvre);
    boolean deleteOeuvre(Long id);
    Theme createTheme(Theme theme);



    // --- Artiste ----
    Artiste createArtiste(Artiste artiste);
    Artiste modifyArtiste(Long id,Artiste artiste);
    boolean deleteArtiste(Long id);
    Artiste getArtistById(Long id);


    // --- coferencier ----
    Conferencier createConferencier(Conferencier conferencier);
    Conferencier modifyConferencier(Conferencier conferencier);
    boolean deleteConferencier(Long id);


    // condition
    Condition createCondition(Condition condition);
    Condition getCondition(Long id);
    Assurance createAssurance(Assurance assurance);


    // --- event ----
    Event getEventByDate(Date date);
    Event createEvent(Event event);
    Event getEventById(Long id );
    Event modifieEvent(Long id,Event event);
    Boolean deleteEvent(Long id );


    // --- manifistation
    Manifistation createManifistation(Manifistation manifistation);
    Manifistation modefieManifistation(Long id,Manifistation manifistation);
    Boolean deleteManifistation(Long id);
}
