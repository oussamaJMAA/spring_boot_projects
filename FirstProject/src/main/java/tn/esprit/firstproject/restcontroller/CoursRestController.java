package tn.esprit.firstproject.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Abonnement;
import tn.esprit.firstproject.entities.Cours;
import tn.esprit.firstproject.services.ICours;

import java.util.List;

@RestController
public class CoursRestController {
  @Autowired
    ICours iCours;

    @PostMapping("/addcours")
    public Cours addCours(@RequestBody Cours c){
        return iCours.addCours(c);
    }
    @PutMapping("/updatecours")
    public Cours updateCours(@RequestBody Cours c){
        return iCours.updateCours(c);
    }
    @DeleteMapping("/deleteCours/{id}")
    public void deleteCours(@PathVariable("id") Long id) {
        iCours.deleteCours(id);
    }


    @GetMapping("/retrievecoursById/{id}")
    public Cours retrieveCoursById(@PathVariable("id") Long id){
        return iCours.retrieveCoursById(id);
    }
    @GetMapping("/retrivecours")
    public List<Cours> retriveCours(){
        return iCours.retriveCours();
    }
}
