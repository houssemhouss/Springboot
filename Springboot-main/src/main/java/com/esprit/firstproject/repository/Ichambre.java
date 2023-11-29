package com.esprit.firstproject.repository;

import com.esprit.firstproject.entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Ichambre extends JpaRepository<Chambre, Integer> {
  public List<Chambre> findByIdChambre(Integer idChambre);


    public List<Chambre> findByNumeroChambre(Integer numeroChambre);
}

