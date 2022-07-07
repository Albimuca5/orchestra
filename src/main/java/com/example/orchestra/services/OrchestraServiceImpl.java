package com.example.orchestra.services;

import com.example.orchestra.entities.Event;
import com.example.orchestra.entities.Orchestra;
import com.example.orchestra.repositories.EventRepository;
import com.example.orchestra.repositories.OrchestraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrchestraServiceImpl implements OrchestraService{

    @Autowired
    private OrchestraRepository orchestraRepository;

    @Override
    public void deleteById(Long id) {
        orchestraRepository.deleteById(id);
    }

    @Override
    public Orchestra updateOrchestra(Orchestra orchestra) {
        return null;
    }

    @Override
    public List<Orchestra> getAllOrchestra() {
       return orchestraRepository.findAll();
    }

//    @Override
//    public void insert(Orchestra orchestra) {
//
//    }

    @Override
    public Orchestra findOrchestraById(Long id) {
        return orchestraRepository.getById(id);
    }

    @Override
    public Orchestra saveOrchestra(Orchestra orchestra) {
        return orchestraRepository.save(orchestra);
    }
}
