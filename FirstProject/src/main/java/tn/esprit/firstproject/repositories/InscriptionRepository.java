package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entities.Inscription;


public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
}
