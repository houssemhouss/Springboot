package com.esprit.firstproject.repository;

import com.esprit.firstproject.entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.lang.Integer;
import java.util.Optional;

@Repository
public interface Ibloc extends JpaRepository<Bloc ,Integer> {
    Optional<Bloc> findById(Integer idBloc);

    List<Bloc> findBycapaciteBloc(Integer capaciteBloc);
}
