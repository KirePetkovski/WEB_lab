package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.model.Balloon;
import mk.finki.ukim.mk.lab.model.Manufacturer;

import java.util.List;
import java.util.Optional;

public interface BalloonService {
    List<Balloon> listAll();
    Optional<Balloon> findByName(String name);
    Optional<Balloon> findById(Long Id);
    Optional<Balloon> save(String name, String description, Long manufacturer);
    List<Balloon> searchByNameOrDescription(String text);
    void deleteById(Long id);

}
