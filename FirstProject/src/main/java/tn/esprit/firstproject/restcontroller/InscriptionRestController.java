package tn.esprit.firstproject.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Cours;
import tn.esprit.firstproject.entities.Inscription;
import tn.esprit.firstproject.entities.Skieur;
import tn.esprit.firstproject.services.IInscription;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
public class InscriptionRestController {
    @Autowired
    IInscription iInscription;

    @PostMapping("/addinscription")
    public Inscription addInscription(@RequestBody Inscription i){
        return iInscription.addInscription(i);
    }
    @PutMapping("/updateInscription")
    public Inscription updateInscription(@RequestBody Inscription c){
        return iInscription.updateInscription(c);
    }
    @DeleteMapping("/deleteIns/{id}")
    public void deleteInscription(@PathVariable("id") Long id) {
        iInscription.deleteInscription(id);
    }


    @GetMapping("/retrieveinscriptionById/{id}")
    public Inscription retrieveInscriptionById(@PathVariable("id") Long id){
        return iInscription.retrieveInscriptionById(id);
    }
    @GetMapping("/retriveinscription")
    public List<Inscription> retriveInscription(){
        return iInscription.retriveInscription();
    }

    @PostMapping("/addInscriptionAssignToSkieur/{numSkieur}")
    public Inscription addInscriptionAssignToSkieur(@RequestBody Inscription insc, @PathVariable("numSkieur") Long numS){
        return iInscription.addInscriptionAssignToSkieur(insc,numS);
    }
    @PostMapping("/addInscriptionAssignToCours/{numCours}")
    public Inscription addInscriptionAssignToCours(@RequestBody Inscription insc, @PathVariable("numCours") Long numC){
        return iInscription.addInscriptionAssignToCours(insc,numC);
    }
}
