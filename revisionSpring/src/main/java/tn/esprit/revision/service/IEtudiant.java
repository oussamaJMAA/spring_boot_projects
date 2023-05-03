package tn.esprit.revision.service;

import tn.esprit.revision.entities.Etudiant;

import java.util.List;

public interface IEtudiant  {
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    void deleteEtudiant(Integer id);
    Etudiant getEtudiantById(Integer id);
    List<Etudiant> getAllEtudiants();
   void  assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;
}

