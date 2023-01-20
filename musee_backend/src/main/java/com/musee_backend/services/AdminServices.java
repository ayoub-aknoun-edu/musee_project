package com.musee_backend.services;

import com.musee_backend.models.*;

import java.util.Date;
import java.util.HashMap;

public interface AdminServices {
    Artiste getArtistById(Long id);
    Oeuvre createOeuvre(Oeuvre oeuvre);
    Oeuvre modifyOeuvre(Oeuvre oeuvre);
    int deleteOeuvre(Long id);

    Artiste createArtiste(Artiste artiste);
    Artiste modifyArtiste(Artiste artiste);
    int deleteArtiste(Long id);

    Artiste createConferencier(Conferencier conferencier);
    Artiste modifyConferencier(Conferencier conferencier);
    int deleteConferencier(Long id);

    HashMap<Date, Evenement> getCalendar();
    Evenement getEvent(Date date);
    Condition createCondition(Condition condition);
    Assurance createAssurance(Assurance assurance);
}
