package com.example.orchestra.repositories;

import com.example.orchestra.entities.Event;
import com.example.orchestra.entities.Orchestra;
import org.springframework.stereotype.Repository;

@Repository
public interface OrchestraRepository extends SoftDeleteRepository<Orchestra,Long>{
}
