package com.esprit.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFoyer ;

    @OneToMany(mappedBy = "foyer",cascade = CascadeType.ALL)
    private Set<Bloc> blocs;


    @OneToOne
    private Universite univer;

    private String nomFoyer;
    private Long capaciteFoyer;


}
