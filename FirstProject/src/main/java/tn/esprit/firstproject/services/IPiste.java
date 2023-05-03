package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Piste;
import tn.esprit.firstproject.entities.Skieur;

import java.util.List;

public interface IPiste {
    Piste addPiste(Piste P);
    Piste updatePiste( Piste P);
    void deletePiste( int id);
    Piste retrievePisteById(int id);
    List<Piste> retrivePiste();
}
