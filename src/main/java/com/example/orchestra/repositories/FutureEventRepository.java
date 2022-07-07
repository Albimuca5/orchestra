package com.example.orchestra.repositories;

import com.example.orchestra.entities.Event;
import com.example.orchestra.entities.FutureEvent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FutureEventRepository extends SoftDeleteRepository<FutureEvent,Long>{

    @Query(value = "select * from futureEvent WHERE status is not false order by futureEvent.order_id desc",
            nativeQuery = true)
    List<FutureEvent> getAllFutureEvents();

    FutureEvent findFutureEventById(Long id);

    List<FutureEvent> findAllByOrderByIdDesc();

}
