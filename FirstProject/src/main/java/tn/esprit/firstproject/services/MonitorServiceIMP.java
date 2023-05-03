package tn.esprit.firstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Cours;
import tn.esprit.firstproject.entities.Moniteur;
import tn.esprit.firstproject.repositories.CoursRepository;
import tn.esprit.firstproject.repositories.MonitorRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class MonitorServiceIMP implements IMonitor{
    @Autowired
    MonitorRepository MonitorRepository ;
    @Autowired
    CoursRepository coursRepository ;
    @Override
    public Moniteur addMonitor(Moniteur M) {
        return MonitorRepository.save(M);
    }

    @Override
    public Moniteur updateMonitor(Moniteur M) {
        return MonitorRepository.save(M);
    }

    @Override
    public void deleteMonitor(Long id) {
MonitorRepository.deleteById(id);
    }

    @Override
    public Moniteur retrieveMonitorById(Long id) {
        return MonitorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Moniteur> retriveMonitor() {
        return MonitorRepository.findAll();
    }

    @Override
    public Moniteur addMoniteurAndassignToCours(Moniteur m, Long idCours) {
       Cours cours = coursRepository.findById(idCours).orElse(null);
       Set<Cours> coursSet = new HashSet<>();
         coursSet.add(cours);
         m.setCours(coursSet);
         return MonitorRepository.save(m);


    }

}
