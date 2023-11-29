package com.esprit.firstproject.repository;


import com.esprit.firstproject.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Iuniversite extends JpaRepository<Universite,Integer> {


    public List<Universite> findByIdUniversite(Integer idUniversite);

    public List<Universite> findByNomUniversite(String nomUniversite);

    public List<Universite> findByAddress(String address);

}
