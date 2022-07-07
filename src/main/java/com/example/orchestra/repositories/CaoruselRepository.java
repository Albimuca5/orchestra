package com.example.orchestra.repositories;

import com.example.orchestra.entities.Caorusel;
import org.springframework.stereotype.Repository;

@Repository
public interface CaoruselRepository extends SoftDeleteRepository<Caorusel,Long>{
}
