package com.esprit.foyeral.repositories;

import com.esprit.foyeral.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {}
