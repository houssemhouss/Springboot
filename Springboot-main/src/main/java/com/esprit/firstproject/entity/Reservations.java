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
public class Reservations implements Serializable {
    @Id
    private String idReservation;
    private Date anneeUniversitaire;
    private Boolean estValid;


    @ManyToMany(mappedBy = "reservations",cascade = CascadeType.ALL)
    private Set<Etudiant>etudiants;



}
