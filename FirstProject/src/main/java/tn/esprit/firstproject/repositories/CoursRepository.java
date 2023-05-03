package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours,Long> {

}
