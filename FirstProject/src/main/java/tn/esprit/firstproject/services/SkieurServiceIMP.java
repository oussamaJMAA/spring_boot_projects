package tn.esprit.firstproject.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Cours;
import tn.esprit.firstproject.entities.Inscription;
import tn.esprit.firstproject.entities.Piste;
import tn.esprit.firstproject.entities.Skieur;
import tn.esprit.firstproject.repositories.CoursRepository;
import tn.esprit.firstproject.repositories.InscriptionRepository;
import tn.esprit.firstproject.repositories.PisteRepository;
import tn.esprit.firstproject.repositories.SkieurRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class SkieurServiceIMP implements ISkieur {
    @Autowired
    SkieurRepository skieurRepository;
    @Autowired
    PisteRepository pisteRepository;
    @Autowired
    CoursRepository coursRepository;
    @Autowired
    InscriptionRepository inscriptionRepository;

    @Override
    public Skieur addSkieur(Skieur sk) {
        return skieurRepository.save(sk);
    }

    @Override
    public Skieur updateSkieur(Skieur sk) {
        return skieurRepository.save(sk);
    }

    @Override
    public void deleteSkieur(Long id) {
        skieurRepository.deleteById(id);
    }

    @Override
    public Skieur retrieveSkieurById(Long id) {
        return skieurRepository.findById(id).orElse(null);
    }

    @Override
    public List<Skieur> retriveSkieur() {
        List<Skieur> skieurs = (List<Skieur>) skieurRepository.findAll();
        for (Skieur skieur : skieurs) {
            log.info("skieur  : " + skieur);
        }
        return skieurs;
    }

    @Override
    public Skieur findBynomSAndPrenomS(String n, String p) {
        return skieurRepository.findBynomSAndPrenomS(n, p);
    }

    @Override
    public List<Skieur> findByVilleNotNull() {
        return skieurRepository.findByVilleNotNull();
    }

    public List<Skieur> findByPisteIdPiste(Integer id) {
        return skieurRepository.findByPisteIdPiste(id);
    }

    @Override
    public Skieur AssignSkieurToPiste(Long idSkieur, Integer idPiste) {
        Skieur s = skieurRepository.findById(idSkieur).orElse(null);
        Piste p = pisteRepository.findById(idPiste).orElse(null);
        try {
            s.getPiste().add(p);
        } catch (NullPointerException exception) {
            Set<Piste> pisteListe = new HashSet<>();
            pisteListe.add(p);
            s.setPiste(pisteListe);

        }
        return skieurRepository.save(s);
    }
    @Override
    public List<Skieur> findByAbonnementPrixAbon(Float prix){
        //return skieurRepository.findByAbonnementPrixAbon(prix);
        //return skieurRepository.retrieveSkieurByPrixAbon(prix);
        return skieurRepository.retrieveByPrixAbon(prix);
}

    @Override
    public Skieur addSKieurAndAssignToCours(Skieur s, Long idCours) {
        Skieur  sk = skieurRepository.save(s);
        Cours c = coursRepository.findById(idCours).orElse(null);
        Set <Inscription> inscriptions = sk.getInscription();
        for(Inscription i : inscriptions){
            i.setSkieur(sk);
            i.setCours(c);
            inscriptionRepository.save(i);
        }

        return skieurRepository.save(sk);

        }



    /*@Scheduled(fixedRate = 30000)
    public void fixedRateSkieur(){
        System.out.println("fixedRateSkieur");


}*/
  /*
    @Scheduled(fixedDelay = 30000)
    public void fixedDelaySkieur(){
        System.out.println("fixedDelaySkieur");
    }
    */


    @Scheduled(cron = "0 1 13 17 4 MON")
    public void cronSkieur(){
        System.out.println("cronSkieur");
    }

}
