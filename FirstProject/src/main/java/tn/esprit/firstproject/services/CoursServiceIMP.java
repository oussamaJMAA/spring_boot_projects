package tn.esprit.firstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Cours;
import tn.esprit.firstproject.repositories.CoursRepository;

import java.util.List;
@Service
public class CoursServiceIMP implements ICours{
    @Autowired
    CoursRepository coursRepository;
    @Override
    public Cours addCours(Cours c) {
        return coursRepository.save(c);
    }

    @Override
    public Cours updateCours(Cours c) {
        return coursRepository.save(c);
    }

    @Override
    public void deleteCours(Long id) {
coursRepository.deleteById(id);
    }

    @Override
    public Cours retrieveCoursById(Long id) {
        return coursRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cours> retriveCours() {
        return coursRepository.findAll();
    }
}
