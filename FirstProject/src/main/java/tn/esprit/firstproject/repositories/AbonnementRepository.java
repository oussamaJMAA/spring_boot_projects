package tn.esprit.firstproject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entities.Abonnement;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {
}
