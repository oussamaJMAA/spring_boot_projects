package tn.esprit.firstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Piste;
import tn.esprit.firstproject.repositories.PisteRepository;


import java.util.List;
@Service
public class PisteServiceIMP implements IPiste {
@Autowired
PisteRepository pisteRepository ;
    @Override
    public Piste addPiste(Piste P) {
        return pisteRepository.save(P);
    }

    @Override
    public Piste updatePiste(Piste P) {
        return pisteRepository.save(P);
    }

    @Override
    public void deletePiste(int id) {
pisteRepository.deleteById(id);
    }

    @Override
    public Piste retrievePisteById(int id) {
        return pisteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Piste> retrivePiste() {
        return pisteRepository.findAll();
    }
}
