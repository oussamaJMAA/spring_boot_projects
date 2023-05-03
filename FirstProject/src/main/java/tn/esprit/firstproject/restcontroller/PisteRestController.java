package tn.esprit.firstproject.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Piste;
import tn.esprit.firstproject.services.IPiste;

import java.util.List;

@RestController
public class PisteRestController {
   @Autowired
    IPiste iPiste;

    @PostMapping("/addpiste")
    public Piste addPiste(@RequestBody Piste p){
        return iPiste.addPiste(p);
    }
    @PutMapping("/updatePiste")
    public Piste updatePiste(@RequestBody Piste p){
        return iPiste.updatePiste(p);
    }
    @DeleteMapping("/deletePiste/{id}")
    public void deletePiste(@PathVariable("id") Long id) {
        iPiste.deletePiste(Math.toIntExact(id));
    }


    @GetMapping("/retrievepisteById/{id}")
    public Piste retrievePisteById(@PathVariable("id") Long id){
        return iPiste.retrievePisteById(Math.toIntExact(id));
    }
    @GetMapping("/retrivepiste")
    public List<Piste> retrivePiste(){
        return iPiste.retrivePiste();
    }
}
