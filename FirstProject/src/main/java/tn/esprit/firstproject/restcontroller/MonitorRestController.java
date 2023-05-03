package tn.esprit.firstproject.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Inscription;
import tn.esprit.firstproject.entities.Moniteur;
import tn.esprit.firstproject.services.IMonitor;

import java.util.List;

@RestController
public class MonitorRestController {
    @Autowired
    IMonitor iMonitor;

    @PostMapping("/addmoniteur")
    public Moniteur addMonitor(@RequestBody Moniteur m){
        return iMonitor.addMonitor(m);
    }
    @PutMapping("/updateMoniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur m){
        return iMonitor.updateMonitor(m);
    }
    @DeleteMapping("/deleteMoniteur/{id}")
    public void deleteMoniteur(@PathVariable("id") Long id) {
        iMonitor.deleteMonitor(id);
    }


    @GetMapping("/retrievemoniteurById/{id}")
    public Moniteur retrieveInscriptionById(@PathVariable("id") Long id){
        return iMonitor.retrieveMonitorById(id);
    }
    @GetMapping("/retrivemoniteur")
    public List<Moniteur> retriveMoniteur(){
        return iMonitor.retriveMonitor();
    }
    @PostMapping("/addMoniteurAndassignToCours/{numcours}")
    public Moniteur addMoniteurAndassignToCours(@RequestBody Moniteur m ,@PathVariable("numcours") Long num_cours){
        return iMonitor.addMoniteurAndassignToCours(m,num_cours);
    }
}
