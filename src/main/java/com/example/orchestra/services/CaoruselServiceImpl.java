package com.example.orchestra.services;

import com.example.orchestra.entities.Caorusel;
import com.example.orchestra.repositories.CaoruselRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaoruselServiceImpl implements CaoruselService{

    @Autowired
    private CaoruselRepository caoruselRepository;

    @Override
    public void deleteById(Long id) {
        caoruselRepository.deleteById(id);
    }

    @Override
    public Caorusel updateCaorusel(Caorusel caorusel) {
        return null;
    }

    @Override
    public List<Caorusel> getAllCaorusels() {
       return caoruselRepository.findAll();
    }

//    @Override
//    public void insert(Event event) {
//
//    }

    @Override
    public Caorusel findCaoruselById(Long id) {
        return caoruselRepository.getById(id);
    }

    @Override
    public Caorusel saveCaorusel(Caorusel caorusel) {
        return caoruselRepository.save(caorusel);
    }
}
