package tn.esprit.revision.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.revision.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

}
