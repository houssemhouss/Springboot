package com.esprit.firstproject.repository;

import com.esprit.firstproject.entity.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Ifoyer extends JpaRepository<Foyer,Integer> {


    public List<Foyer> findFoyerByIdFoyer(Integer idFoyer);

    public List<Foyer> findByNomFoyer(String nomFoyer);

    public List<Foyer> findByCapaciteFoyer(Long capaciteFoyer);
}
