package tn.esprit.firstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Abonnement;
import tn.esprit.firstproject.repositories.AbonnementRepository;

import java.util.List;
@Service
public class AbonnementServiceIMP implements IAbonnement{
    @Autowired
    AbonnementRepository abonnementRepository;
    @Override
    public Abonnement addAbonnement(Abonnement a) {
        return abonnementRepository.save(a);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement a) {
        return abonnementRepository.save(a);
    }

    @Override
    public void deleteAbonnement(Long id) {
abonnementRepository.deleteById(id);
    }

    @Override
    public Abonnement retrieveAbonnementById(Long id) {
        return abonnementRepository.findById(id).orElse(null);
    }

    @Override
    public List<Abonnement> retriveAbonnement() {
        return abonnementRepository.findAll();
    }
}
