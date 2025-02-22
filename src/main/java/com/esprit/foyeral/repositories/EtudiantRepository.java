package com.esprit.foyeral.repositories;

import com.esprit.foyeral.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {}
