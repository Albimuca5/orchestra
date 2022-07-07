package com.example.orchestra.controllers;


import com.example.orchestra.entities.Orchestra;
import com.example.orchestra.services.OrchestraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrchetraController {
    @Autowired
    private OrchestraService orchestraService;

    @GetMapping("/orchestra")
    public List<Orchestra> getAllOrchestra(){
        return orchestraService.getAllOrchestra();
    }

    @GetMapping("/orchestra/{id}")
    public Orchestra getOrchestraById(@PathVariable Long id){
        return orchestraService.findOrchestraById(id);
    }

    @PostMapping("/addOrchestra")
    public Orchestra addOrchestra(@RequestBody Orchestra orchestra){
        return orchestraService.saveOrchestra(orchestra);
    }

    @DeleteMapping(value="/orchestraDelete/{id}")
    public ResponseEntity<Void> deleteOrchestra(@PathVariable Long id){
        orchestraService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/updateOrchestra")
    public Orchestra updateOrchestra(@RequestBody Orchestra orchestra){
        return orchestraService.updateOrchestra(orchestra);
    }
}
