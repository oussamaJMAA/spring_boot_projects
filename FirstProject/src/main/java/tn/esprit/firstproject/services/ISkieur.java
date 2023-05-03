package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Skieur;

import java.util.List;

public interface ISkieur {
    Skieur addSkieur(Skieur sk);
    Skieur updateSkieur( Skieur sk);
    void deleteSkieur( Long id);
    Skieur retrieveSkieurById(Long id);
    List<Skieur> retriveSkieur();
    Skieur findBynomSAndPrenomS(String n , String p);

    List<Skieur> findByVilleNotNull();
    List<Skieur>findByPisteIdPiste(Integer id);
    Skieur AssignSkieurToPiste(Long idSkieur, Integer idPiste);
    List<Skieur> findByAbonnementPrixAbon(Float prix);
    Skieur addSKieurAndAssignToCours(Skieur s, Long idCours);
}
