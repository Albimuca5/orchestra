package com.example.orchestra.controllers;

import com.example.orchestra.entities.Caorusel;
import com.example.orchestra.services.CaoruselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CaoruselController {

    @Autowired
    private CaoruselService caoruselService;

    @GetMapping("/caorusels")
    public List<Caorusel> getAllCaorusels(){
        return caoruselService.getAllCaorusels();
    }

    @GetMapping("/caorusel/{id}")
    public Caorusel getCaoruselById(@PathVariable Long id){
        return caoruselService.findCaoruselById(id);
    }

    @PostMapping("/addCaorusel")
    public Caorusel addCaorusel(@RequestBody Caorusel caorusel){
        return caoruselService.saveCaorusel(caorusel);
    }

    @DeleteMapping(value="/caoruselDelete/{id}")
    public ResponseEntity<Void> deleteCaorusel(@PathVariable Long id){
        caoruselService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/updateCaorusel")
    public Caorusel updateCarousel(@RequestBody Caorusel caorusel){
        return caoruselService.updateCaorusel(caorusel);
    }
}
