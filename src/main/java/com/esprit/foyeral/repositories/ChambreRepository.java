package com.esprit.foyeral.repositories;

import com.esprit.foyeral.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {}
