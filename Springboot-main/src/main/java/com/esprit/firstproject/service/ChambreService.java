package com.esprit.firstproject.service;

import com.esprit.firstproject.entity.Chambre;
import com.esprit.firstproject.repository.Ichambre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ChambreService implements IChambreService {

    @Autowired
    private Ichambre ichambre;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return ichambre.findAll();
    }

    @Override
    public Chambre retrieveChambre(Integer idChambre) {
        Optional<Chambre> optionalChambre = ichambre.findById(idChambre);

        if (optionalChambre.isPresent()) {
            return optionalChambre.get();
        } else {

            return null;
        }
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return ichambre.save(c);
    }

    @Override
    public void removeChambre(Integer idChambre) {
        ichambre.deleteById(idChambre);
    }

    @Override
    public Chambre modifyChambre(Integer idChambre, Chambre updatedChambre) {
        Optional<Chambre> optchambre = ichambre.findById(idChambre);
        if (optchambre.isPresent()) {
            Chambre chambreExistante = optchambre.get();

            chambreExistante.setNumeroChambre(updatedChambre.getNumeroChambre());
            chambreExistante.setChambreType(updatedChambre.getChambreType());
            return ichambre.save(chambreExistante);
        } else {
            return null;
        }
    }
}
