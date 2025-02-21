package com.esprit.foyeral.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "etudiant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private Long cin;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateNaissance;
    private String ecole;
    private String nomEt;
    private String prenomEt;

    @ManyToMany(mappedBy = "etudiants")
    private Set<Reservation> reservations;
}
