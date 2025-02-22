package com.esprit.foyeral.services;

import com.esprit.foyeral.entities.Chambre;
import com.esprit.foyeral.repositories.ChambreRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {

  private final ChambreRepository chambreRepository;

  @Override
  public Chambre add(Chambre chambre) {
    return chambreRepository.save(chambre);
  }

  @Override
  public Chambre update(Chambre chambre) {
    return chambreRepository.save(chambre);
  }

  @Override
  public void delete(Long id) {
    if (this.getById(id).isPresent()) {
      chambreRepository.deleteById(id);
    }
  }

  @Override
  public List<Chambre> getAll() {
    return chambreRepository.findAll();
  }

  @Override
  public Optional<Chambre> getById(Long id) {
    return chambreRepository.findById(id);
  }

  @Override
  public List<Chambre> addBatch(List<Chambre> chambres) {
    return chambreRepository.saveAll(chambres);
  }
}
