package com.esprit.foyeral.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    @Temporal(TemporalType.TIMESTAMP)
    private Date anneUniversitaire;
    private Boolean estValdie;

    @ManyToMany
    private Set<Etudiant> etudiants;
}