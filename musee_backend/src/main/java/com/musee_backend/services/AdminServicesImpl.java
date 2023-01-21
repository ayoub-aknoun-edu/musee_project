package com.musee_backend.services;

import com.musee_backend.models.*;
import com.musee_backend.repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
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
    private final ThemeRepository themeRepository;

    @Override
    public Theme createTheme(Theme theme) {
        return themeRepository.save(theme);
    }

    @Override
    public Artiste getArtistById(Long id) {
       return artisteRepository.findById(id).orElse(null);
    }

    @Override
    public Oeuvre createOeuvre(OeuvreCrObject oeuvre) {
        Artiste artiste = artisteRepository.findById(oeuvre.getArtisteId()).orElse(null);
        Assurance assurance = assuranceRepository.findById(oeuvre.getAssuranceId()).orElse(null);
        Theme theme = themeRepository.findById(oeuvre.getThemeId()).orElse(null);
        if(artiste!=null && assurance!=null && theme!= null) {
            Oeuvre newOeuvre = new Oeuvre(null, oeuvre.getName(), oeuvre.getType(), artiste, assurance, theme);
            return oeuvreReository.save(newOeuvre);
        }
        return null;
    }

    @Override
    public Oeuvre modifyOeuvre(Long id,Oeuvre modifiedOeuvre) {
        Oeuvre oeuvre = oeuvreReository.findById(id).orElseThrow(()->new ResourceNotFoundException("Oeuvre"));
        oeuvre.setName(modifiedOeuvre.getName());
        oeuvre.setAssurance(modifiedOeuvre.getAssurance());
        oeuvre.setProprietaire(modifiedOeuvre.getProprietaire());
        oeuvre.setType(modifiedOeuvre.getType());
        return oeuvreReository.save(oeuvre);

    }

    @Override
    public boolean deleteOeuvre(Long id) {
        Oeuvre oeuvre = oeuvreReository.findById(id).orElse(null);
        if(oeuvre!=null) {
            oeuvreReository.delete(oeuvre);
            return true;
        }
        return false;
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
    public boolean deleteArtiste(Long id) {
        Artiste artiste = artisteRepository.findById(id).orElse(null);
        if (artiste!=null){
            artisteRepository.delete(artiste);
            return true;
        }
        return false;
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
    public boolean deleteConferencier(Long id) {
        Conferencier conferencier = conferencierRepository.findById(id).orElse(null);
        if (conferencier!=null){
            conferencierRepository.delete(conferencier);
            return true;
        }
        return false;
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
    public Condition getCondition(Long id) {
        return  conditionRepository.findById(id).orElse(null);
    }

    @Override
    public Assurance createAssurance(Assurance assurance) {
        return assuranceRepository.save(assurance);
    }
}
