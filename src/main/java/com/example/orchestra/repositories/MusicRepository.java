package com.example.orchestra.repositories;

import com.example.orchestra.entities.Caorusel;
import com.example.orchestra.entities.Music;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends SoftDeleteRepository<Music,Long>{
}
