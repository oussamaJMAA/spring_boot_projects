package tn.esprit.firstproject.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Cours;
import tn.esprit.firstproject.entities.Inscription;
import tn.esprit.firstproject.entities.Skieur;
import tn.esprit.firstproject.repositories.CoursRepository;
import tn.esprit.firstproject.repositories.InscriptionRepository;
import tn.esprit.firstproject.repositories.SkieurRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class InscriptionServiceIMP implements IInscription{
    InscriptionRepository inscriptionRepository;
    SkieurRepository skieurRepository ;
    CoursRepository coursRepository ;
    @Override
    public Inscription addInscription(Inscription I) {
        return inscriptionRepository.save(I);
    }

    @Override
    public Inscription updateInscription(Inscription I) {
        return inscriptionRepository.save(I);
    }

    @Override
    public void deleteInscription(Long id) {
inscriptionRepository.deleteById(id);
    }

    @Override
    public Inscription retrieveInscriptionById(Long id) {
        return inscriptionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Inscription> retriveInscription() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription addInscriptionAssignToSkieur(Inscription insc, Long numSkieur) {
        Skieur sk = skieurRepository.findById(numSkieur).orElse(null) ;
        insc.setSkieur(sk);
        return inscriptionRepository.save(insc);

    }

    @Override
    public Inscription addInscriptionAssignToCours(Inscription insc, Long numCours) {
    Cours cours = coursRepository.findById(numCours).orElse(null);
    insc.setCours(cours);
    return inscriptionRepository.save(insc);
    }

}
