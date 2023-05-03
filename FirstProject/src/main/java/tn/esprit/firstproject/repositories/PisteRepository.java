package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entities.Piste;
import tn.esprit.firstproject.entities.Skieur;

public interface PisteRepository extends JpaRepository<Piste,Integer> {
}
