package com.musee_backend.services;

import com.musee_backend.models.*;

import java.util.Date;
import java.util.HashMap;

public interface AdminServices {
    Theme createTheme(Theme theme);
    Artiste getArtistById(Long id);
    Oeuvre createOeuvre(OeuvreCrObject oeuvre);
    Oeuvre modifyOeuvre(Long id,Oeuvre oeuvre);
    boolean deleteOeuvre(Long id);

    Artiste createArtiste(Artiste artiste);
    Artiste modifyArtiste(Artiste artiste);
    boolean deleteArtiste(Long id);

    Artiste createConferencier(Conferencier conferencier);
    Artiste modifyConferencier(Conferencier conferencier);
    boolean deleteConferencier(Long id);

    HashMap<Date, Evenement> getCalendar();
    Evenement getEvent(Date date);
    Condition createCondition(Condition condition);
    Condition getCondition(Long id);
    Assurance createAssurance(Assurance assurance);
}
