package com.example.orchestra.services;

import com.example.orchestra.entities.Caorusel;
import com.example.orchestra.entities.Event;

import java.util.List;

public interface CaoruselService {

    void deleteById(Long id);

    Caorusel updateCaorusel(Caorusel caorusel);

    public List<Caorusel> getAllCaorusels();

//    public void insert(Caorusel caorusel);

    Caorusel findCaoruselById(Long id);

    Caorusel saveCaorusel(Caorusel caorusel);
}
