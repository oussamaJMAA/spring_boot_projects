package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Inscription;
import tn.esprit.firstproject.entities.Skieur;

import java.util.List;

public interface IInscription {
    Inscription addInscription(Inscription I);

    Inscription updateInscription( Inscription I);
    void deleteInscription( Long id);
    Inscription retrieveInscriptionById(Long id);
    List<Inscription> retriveInscription();
    Inscription addInscriptionAssignToSkieur(Inscription insc , Long numSkieur);
    Inscription addInscriptionAssignToCours(Inscription insc,Long numCours);
}
