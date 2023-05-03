package tn.esprit.firstproject.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Abonnement;
import tn.esprit.firstproject.entities.Skieur;
import tn.esprit.firstproject.services.IAbonnement;

import java.util.List;

@RestController
public class AbonnementRestController {
    @Autowired
    IAbonnement iAbonnement;
    @PostMapping("/addabonnement")
    public Abonnement addAbonnement(@RequestBody Abonnement a){
        return iAbonnement.addAbonnement(a);
    }
    @PutMapping("/updateabonnement")
    public Abonnement updateAbonnement(@RequestBody Abonnement a){
        return iAbonnement.updateAbonnement(a);
    }
    @DeleteMapping("/deleteAbonnement/{id}")
    public void deleteAbonnement(@PathVariable("id") Long id) {
        iAbonnement.deleteAbonnement(id);
    }


    @GetMapping("/retrieveabonnementById/{id}")
    public Abonnement retrieveAbonnementById(@PathVariable("id") Long id){
        return iAbonnement.retrieveAbonnementById(id);
    }
    @GetMapping("/retriveabonnement")
    public List<Abonnement> retriveAbonnements(){
        return iAbonnement.retriveAbonnement();
    }
}
