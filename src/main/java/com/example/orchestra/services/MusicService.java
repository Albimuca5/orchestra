package com.example.orchestra.services;

import com.example.orchestra.entities.Caorusel;
import com.example.orchestra.entities.Music;

import java.util.List;

public interface MusicService {

    void deleteById(Long id);

    Music updateMusic(Music music);

    public List<Music> getAllMusics();

//    public void insert(Music music);

    Music findMusicById(Long id);

    Music saveMusic(Music music);
}
