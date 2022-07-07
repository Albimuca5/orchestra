package com.example.orchestra.services;

import com.example.orchestra.entities.Event;
import com.example.orchestra.entities.Orchestra;

import java.util.List;

public interface OrchestraService {

    void deleteById(Long id);

    Orchestra updateOrchestra(Orchestra orchestra);

    public List<Orchestra> getAllOrchestra();

//    public void insert(Orchestra orchestra);

    Orchestra findOrchestraById(Long id);

    Orchestra saveOrchestra(Orchestra orchestra);
}
