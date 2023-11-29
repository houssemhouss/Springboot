package com.esprit.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant;

    private String nomEt;
    private String prenomEt;

    private Long cin;
    private String ecole;
    private Date dateNaissance;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reservations> reservations;

}
