package com.esprit.firstproject.repository;


import com.esprit.firstproject.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface Ietudiant extends JpaRepository<Etudiant,Integer>
{
    public List<Etudiant> findAll();

    public  List<Etudiant> findEtudiantByEcole(String ecole);

    public Etudiant findEtudiantByCin(Integer cin);

    public List<Etudiant> findEtudiantByDateNaissance(Date dateNaissance);




}
