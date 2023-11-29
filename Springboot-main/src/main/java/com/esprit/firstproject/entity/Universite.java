package com.esprit.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniversite ;

    @OneToOne(mappedBy = "univer", cascade = CascadeType.ALL)
    private Foyer foyer;


    private String nomUniversite;
    private String address;
}
