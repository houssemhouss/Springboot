package com.esprit.firstproject.service;

import com.esprit.firstproject.entity.Chambre;

import java.util.List;

public interface IChambreService {
    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Integer idChambre);
    public Chambre addChambre(Chambre c);
    public void removeChambre(Integer idChambre);
    public Chambre modifyChambre(Integer idChambre,Chambre updatedChambre);
}
