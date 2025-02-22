package com.esprit.foyeral.services;

import com.esprit.foyeral.entities.Chambre;

import java.util.List;
import java.util.Optional;

public interface IChambreService {
    Chambre add(Chambre chambre);
    Chambre update(Chambre chambre);
    void delete(Long id);
    List<Chambre> getAll();
    Optional<Chambre> getById(Long id);
}
