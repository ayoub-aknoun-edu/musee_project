package com.musee_backend.services;

import com.musee_backend.models.*;
import com.musee_backend.repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.HashMap;

@AllArgsConstructor
@Transactional
@Service
public class AdminServicesImpl implements AdminServices {
    private ArtisteRepository artisteRepository;
    private OeuvreReository oeuvreReository;
    private ConferencierRepository conferencierRepository;
    private ConferanceRepository conferanceRepository;
    private ConditionRepository conditionRepository;
    private  AssuranceRepository assuranceRepository;

    @Override
    public Artiste getArtistById(Long id) {
       return artisteRepository.findById(id).orElse(null);
    }

    @Override
    public Oeuvre createOeuvre(Oeuvre oeuvre) {
        return oeuvreReository.save(oeuvre);
    }

    @Override
    public Oeuvre modifyOeuvre(Oeuvre oeuvre) {
        return null;
    }

    @Override
    public int deleteOeuvre(Long id) {
        return 0;
    }

    @Override
    public Artiste createArtiste(Artiste artiste) {
        return  artisteRepository.save(artiste);
    }

    @Override
    public Artiste modifyArtiste(Artiste artiste) {
        return null;
    }

    @Override
    public int deleteArtiste(Long id) {
        return 0;
    }

    @Override
    public Artiste createConferencier(Conferencier conferencier) {
        return null;
    }

    @Override
    public Artiste modifyConferencier(Conferencier conferencier) {
        return null;
    }

    @Override
    public int deleteConferencier(Long id) {
        return 0;
    }

    @Override
    public HashMap<Date, Evenement> getCalendar() {
        return null;
    }

    @Override
    public Evenement getEvent(Date date) {
        return null;
    }

    @Override
    public Condition createCondition(Condition condition) {
        return conditionRepository.save(condition);
    }

    @Override
    public Assurance createAssurance(Assurance assurance) {
        return assuranceRepository.save(assurance);
    }
}
