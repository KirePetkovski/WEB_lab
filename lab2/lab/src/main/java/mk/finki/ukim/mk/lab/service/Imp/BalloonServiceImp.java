package mk.finki.ukim.mk.lab.service.Imp;

import mk.finki.ukim.mk.lab.model.Balloon;
import mk.finki.ukim.mk.lab.model.Manufacturer;
import mk.finki.ukim.mk.lab.model.exception.BalloonNotFoundException;
import mk.finki.ukim.mk.lab.model.exception.ManufacturerNotFoundException;
import mk.finki.ukim.mk.lab.repository.BalloonRepository;
import mk.finki.ukim.mk.lab.repository.ManufacturerRepository;
import mk.finki.ukim.mk.lab.service.BalloonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BalloonServiceImp implements BalloonService {

    public final BalloonRepository balloonRepository;
    public final ManufacturerRepository manufacturerRepository;

    public BalloonServiceImp(BalloonRepository balloonRepository, ManufacturerRepository manufacturerRepository) {
        this.balloonRepository = balloonRepository;
        this.manufacturerRepository = manufacturerRepository;
    }

    @Override
    public List<Balloon> listAll() {
        return  this.balloonRepository.findAllBalloons();
    }


    @Override
    public Optional<Balloon> findByName(String name) {
        return this.balloonRepository.findByName(name);
    }

    @Override
    public Optional<Balloon> findById(Long Id) {
        return this.balloonRepository.findById(Id);
    }

    @Override
    public Optional<Balloon> save(String name, String description, Long manufacturerId) {
        Manufacturer manufacturer = this.manufacturerRepository.findById(manufacturerId)
                .orElseThrow(() -> new ManufacturerNotFoundException(manufacturerId));

        //this.balloonRepository.deleteByName(name);
        //return Optional.of(this.balloonRepository.save(name, description, manufacturer));
         return this.balloonRepository.save(name, description, manufacturer);
    }


    @Override
    public List<Balloon> searchByNameOrDescription(String text) {
        return balloonRepository.findAllByNameOrDescription(text);
    }

    @Override
    public void deleteById(Long id) {
        this.balloonRepository.deleteById(id);
    }
}
