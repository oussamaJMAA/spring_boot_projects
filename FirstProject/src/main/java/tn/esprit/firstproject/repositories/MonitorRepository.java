package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entities.Moniteur;
import tn.esprit.firstproject.entities.Piste;

public interface MonitorRepository extends JpaRepository<Moniteur,Long> {
}
