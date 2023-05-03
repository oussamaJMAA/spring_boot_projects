package tn.esprit.revision.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.revision.entities.Departement;
import tn.esprit.revision.entities.Etudiant;
import tn.esprit.revision.repo.DepartementRepository;
import tn.esprit.revision.repo.EtudiantRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class EtudiantIMP implements IEtudiant{
@Autowired
private EtudiantRepository etudiantRepository;
@Autowired
private DepartementRepository departementRepository;
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Integer id) {
    etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant getEtudiantById(Integer id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
Etudiant etudiant = etudiantRepository.findById(etudiantId).orElse(null);
Departement departement = departementRepository.findById(departementId).orElse(null);
etudiant.setDepartement(departement);
etudiantRepository.save(etudiant);
    }
}
