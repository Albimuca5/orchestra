package com.example.orchestra.repositories;

import com.example.orchestra.entities.Event;
import com.example.orchestra.entities.FutureEvent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends SoftDeleteRepository<Event,Long>{

    @Query(value = "select * from event WHERE status is not false order by event.order_id desc",
            nativeQuery = true)
    List<Event> getAllEvents();


    Event findEventById(Long id);

    List<Event> findAllByOrderByIdDesc();
}
