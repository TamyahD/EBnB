package EBNB.Ebnb.service;

import EBNB.Ebnb.Repo.RepoShelter;
import EBNB.Ebnb.models.Shelter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelterService {
    private RepoShelter shelterRepo;

    public ShelterService(RepoShelter shelterRepo) {
        this.shelterRepo = shelterRepo;
    }

    public Iterable<Shelter> shelterList() {
        return shelterRepo.findAll();
    }

    public Shelter save(Shelter shelter) {
        return shelterRepo.save(shelter);
    }

    public Iterable<Shelter> save(List<Shelter> shelters) {
        return shelterRepo.saveAll(shelters);
    }
}
