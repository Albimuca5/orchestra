package com.example.orchestra.services;

import com.example.orchestra.entities.Caorusel;
import com.example.orchestra.entities.Music;
import com.example.orchestra.repositories.CaoruselRepository;
import com.example.orchestra.repositories.MusicRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService{
    @Autowired

    private MusicRepository musicRepository;

    @Override
    public void deleteById(Long id) {
        musicRepository.deleteById(id);
    }

    @Override
    public Music updateMusic(Music music) {
        return null;
    }

    @Override
    public List<Music> getAllMusics() {
        return musicRepository.findAll();
    }

//    @Override
//    public void insert(Event event) {
//
//    }

    @Override
    public Music findMusicById(Long id) {
        return musicRepository.getById(id);
    }

    @Override
    public Music saveMusic(Music music) {
        return musicRepository.save(music);
    }
}
