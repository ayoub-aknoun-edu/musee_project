package com.musee_backend.services;

import com.musee_backend.models.*;
import com.musee_backend.repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;


@AllArgsConstructor
@Service
@Transactional
public class GeneralServecesImpl implements GeneralServeces {

   private OeuvreReository oeuvreReository;
   private ArtisteRepository artisteRepository;
   private ConferencierRepository conferencierRepository;
   private ConferanceRepository conferanceRepository;
   private ManifistationRepository manifistationRepository;

   private UserRepository userRepository;
    @Override
    public List<Oeuvre> getOeuvres() {
        return oeuvreReository.findAll();
    }

    @Override
    public List<Artiste> getArtistes() {
        return artisteRepository.findAll();
    }

    @Override
    public List<Oeuvre> getOeuvreByType(TypeOeuvre typeOeuvre) {
      return oeuvreReository.findAll()
                            .stream()
                            .filter(oeuvre -> oeuvre.getType()==typeOeuvre)
                            .toList();

    }

    @Override
    public List<Oeuvre> getOeuvreByArtiste(String firstname,String lasname)
    {
        return oeuvreReository.findAll()
                                .stream()
                                .filter(oeuvre -> oeuvre.getProprietaire().getLastName().equals(lasname)&& oeuvre.getProprietaire().getFirstName().equals(firstname))
                                .toList();
    }

    @Override
    public List<Conference> getConferences() {
        return conferanceRepository.findAll();
    }

    @Override
    public List<Manifistation> getManifestations() {

        return manifistationRepository.findAll();
    }

    @Override
    public Artiste getArtistByFLnames(String firstName, String lastName){
        return artisteRepository.findByFirstNameAndLastName(firstName,lastName).get();
    }
}
