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
    private final ArtisteRepository artisteRepository;
    private final OeuvreReository oeuvreReository;
    private final ConferencierRepository conferencierRepository;
    private final ConferanceRepository conferanceRepository;
    private final ConditionRepository conditionRepository;
    private final AssuranceRepository assuranceRepository;
    private final ThemeRepository themeRepository;
    private final EventRepository eventRepository;
    private final ManifistationRepository manifistationRepository;

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
            Oeuvre newOeuvre = new Oeuvre(null, oeuvre.getName(), oeuvre.getType(), artiste, assurance, theme,oeuvre.getDescription(),oeuvre.getImageLink());
            return oeuvreReository.save(newOeuvre);
        }
        return null;
    }

    @Override
    public Oeuvre modifyOeuvre(Long id,OeuvreCrObject modifiedOeuvre) {
        Oeuvre oeuvre = oeuvreReository.findById(id).orElseThrow(()->new ResourceNotFoundException("Oeuvre"));
        oeuvre.setName(modifiedOeuvre.getName());
        oeuvre.setType(modifiedOeuvre.getType());
        oeuvre.setImageLink(modifiedOeuvre.getImageLink());
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
    public Artiste modifyArtiste(Long id,Artiste artiste) {
        Artiste oldArtiste = artisteRepository.findById(id).orElse(null);
        artiste.setId(id);
        artiste.setImageLink(artiste.getImageLink());
        return artisteRepository.save(artiste);
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
    public Conferencier createConferencier(Conferencier conferencier) {
        return null;
    }

    @Override
    public Conferencier modifyConferencier(Conferencier conferencier) {
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
    public Event getEventByDate(Date date) {
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

    @Override
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event getEventById(Long id) {
        return  eventRepository.findById(id).orElse(null);
    }

    @Override
    public Event modifieEvent(Long id,Event event) {
        event.setId(id);
        return eventRepository.save(event);
    }

    @Override
    public Boolean deleteEvent(Long id) {
        Event event = eventRepository.findById(id).orElse(null);
        if (event!=null){
            eventRepository.delete(event);
            return true;
        }
        return false;
    }


    // manifistation
    @Override
    public Manifistation createManifistation(Manifistation manifistation) {
        return manifistationRepository.save(manifistation);
    }

    @Override
    public Manifistation modefieManifistation(Long id, Manifistation manifistation) {
        manifistation.setId(id);
        return manifistationRepository.save(manifistation);
    }

    @Override
    public Boolean deleteManifistation(Long id) {
        Manifistation manifistation = manifistationRepository.findById(id).orElse(null);
        if(manifistation!=null) {
            manifistationRepository.delete(manifistation);
            return true;
        }
        return false;
    }
}
