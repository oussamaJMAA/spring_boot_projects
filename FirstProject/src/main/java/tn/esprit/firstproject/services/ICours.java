package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Cours;
import tn.esprit.firstproject.entities.Skieur;

import java.util.List;

public interface ICours {
    Cours addCours(Cours C);
    Cours updateCours( Cours C);
    void deleteCours( Long id);
    Cours retrieveCoursById(Long id);
    List<Cours> retriveCours();
}
