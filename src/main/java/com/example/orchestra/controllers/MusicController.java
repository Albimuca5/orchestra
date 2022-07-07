package com.example.orchestra.controllers;

import com.example.orchestra.entities.Caorusel;
import com.example.orchestra.entities.Music;
import com.example.orchestra.services.CaoruselService;
import com.example.orchestra.services.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping("/musics")
    public List<Music> getAllMusic(){
        return musicService.getAllMusics();
    }

    @GetMapping("/music/{id}")
    public Music getMusicById(@PathVariable Long id){
        return musicService.findMusicById(id);
    }

    @PostMapping("/addMusic")
    public Music addMusic(@RequestBody Music music){
        return musicService.saveMusic(music);
    }

    @DeleteMapping(value="/musicDelete/{id}")
    public ResponseEntity<Void> deleteMusic(@PathVariable Long id){
        musicService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/updateMusic")
    public Music updateMusic(@RequestBody Music music){
        return musicService.updateMusic(music);
    }
}
