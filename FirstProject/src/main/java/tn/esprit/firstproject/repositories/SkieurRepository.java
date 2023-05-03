package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.firstproject.entities.Skieur;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
public Skieur findBynomSAndPrenomS(String nom , String p);
public List<Skieur> findByVilleNotNull();
public List<Skieur> findByPisteIdPiste(Integer id);
Skieur findByAbonnementPrixAbon(Float prix);
@Query("select s from Skieur s inner join Abonnement a on s.abonnement.numAbon =a.numAbon where a.prixAbon=:prix")
Skieur retrieveSkieurByPrixAbon(@Param("prix") Float prix);

@Query("SELECT s FROM Skieur s,Abonnement a WHERE a.prixAbon=:prix")
List<Skieur> retrieveByPrixAbon(@Param("prix")Float prix);
}
