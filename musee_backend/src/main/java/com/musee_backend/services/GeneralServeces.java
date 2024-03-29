package com.musee_backend.services;

import com.musee_backend.models.*;

import java.util.List;

public interface GeneralServeces {
    List<Oeuvre> getOeuvres();
    List<Artiste> getArtistes();

    List<Oeuvre> getOeuvreByType(String typeOeuvre);

    List<Oeuvre> getOeuvreByArtiste(String firstname,String lasname);

    List<Conference> getConferences();

    List<Manifistation> getManifestations();
    List<Event> getEvents();

    Artiste getArtistByFLnames(String firstName, String lastName);

}
