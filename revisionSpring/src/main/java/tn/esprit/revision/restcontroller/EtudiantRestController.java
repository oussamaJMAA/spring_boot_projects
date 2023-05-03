package tn.esprit.revision.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.revision.entities.Etudiant;
import tn.esprit.revision.service.IEtudiant;

import java.util.List;

@RestController
public class EtudiantRestController {
    @Autowired
    IEtudiant iEtudiant;

    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant c) {
        return iEtudiant.addEtudiant(c);
    }

    @PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant c) {
        return iEtudiant.updateEtudiant(c);
    }

    @DeleteMapping("/deleteEtudiant/{id}")
    public void deleteEtudiant(@PathVariable("id") Integer id) {
        iEtudiant.deleteEtudiant(id);
    }

    @GetMapping("/getAllEtudiants")
    public List<Etudiant> getAllEtudiants() {
        return iEtudiant.getAllEtudiants();
    }

    @PostMapping("/assignEtudiantToDepartement/{e_id}/{dep_id}")
    public void  assignEtudiantToDepartement(@PathVariable("e_id") Integer etudiantId, @PathVariable("dep_id") Integer departementId) {
        iEtudiant.assignEtudiantToDepartement(etudiantId, departementId);
    }
}