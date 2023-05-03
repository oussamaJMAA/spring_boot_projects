package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Moniteur;


import java.util.List;

public interface IMonitor {
    Moniteur addMonitor(Moniteur sk);
    Moniteur updateMonitor( Moniteur sk);
    void deleteMonitor( Long id);
    Moniteur retrieveMonitorById(Long id);
    List<Moniteur> retriveMonitor();
    Moniteur addMoniteurAndassignToCours(Moniteur m, Long idCours);
}
