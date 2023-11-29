package com.esprit.firstproject.service;

import com.esprit.firstproject.entity.Bloc;
import com.esprit.firstproject.entity.Chambre;

import java.util.List;

public interface IBlocService {
    public List<Bloc> retrieveAllBloc();
    public Bloc retrieveBloc(Integer IdBloc);
    public Bloc addBloc(Bloc b);
    public void removeBloc(Integer IdBloc);
    public Bloc modifyBloc(Integer IdBloc,Bloc updatedBloc);
}

