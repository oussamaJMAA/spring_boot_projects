package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Abonnement;
import tn.esprit.firstproject.entities.Skieur;

import java.util.List;

public interface IAbonnement {
Abonnement addAbonnement(Abonnement sk);
    Abonnement updateAbonnement( Abonnement sk);
    void deleteAbonnement( Long id);
    Abonnement retrieveAbonnementById(Long id);
    List<Abonnement> retriveAbonnement();
}
