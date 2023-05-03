package tn.esprit.firstproject.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Skieur;
import tn.esprit.firstproject.services.ISkieur;

import java.util.List;
@RestController
public class SkieurRestController {
    @Autowired
    ISkieur iSkieur;
    @PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody  Skieur sk){
        return iSkieur.addSkieur(sk);
    }
    @PutMapping("/updateSkieur")
    public Skieur updateSkieur(@RequestBody  Skieur sk){
        return iSkieur.updateSkieur(sk);
    }
    @DeleteMapping("/deleteSkieur/{id}")
    public void deleteSkieur( @PathVariable("id") Long id) {
        iSkieur.deleteSkieur(id);
    }
    @GetMapping("/retrieveById/{id}")
    public Skieur retrieveSkieurById(@PathVariable("id") Long id){
         return iSkieur.retrieveSkieurById(id);
    }
    @GetMapping("/retrieve")
    public List<Skieur> retriveSkieur(){
        return iSkieur.retriveSkieur();
    }
@GetMapping("/findNP/{nom}/{prenom}")
    public Skieur findByNomSAndPrenomS(@PathVariable("nom") String nom ,@PathVariable("prenom") String prenom){
        return iSkieur.findBynomSAndPrenomS(nom,prenom);
}
@GetMapping("/findville")
    public List<Skieur>findByVilleNotNull(){
        return iSkieur.findByVilleNotNull();
}
@GetMapping("/findbypiste/{Piste}")
    public List<Skieur>findByPisteIdPiste(@PathVariable("Piste") Integer id) {
    return iSkieur.findByPisteIdPiste(id);
}
    @GetMapping("/AssignSkieurToPiste/{Piste}/{Skieur}")
    public Skieur AssignSkieurToPiste( @PathVariable("Skieur") Long idSkieur, @PathVariable("Piste") Integer idPiste){
        return iSkieur.AssignSkieurToPiste(idSkieur,idPiste);
    }
    @GetMapping("/findbyabon/{prix}")
    public List<Skieur> findByAbonnementPrixAbon(@PathVariable("prix") Float prix){
        return iSkieur.findByAbonnementPrixAbon(prix);
    }
    @PostMapping("/addSKieurAndAssignToCours/{idCours}")
    public Skieur addSKieurAndAssignToCours(@RequestBody Skieur s, @PathVariable("idCours") Long idCours){
        return iSkieur.addSKieurAndAssignToCours(s,idCours);
    }
}
