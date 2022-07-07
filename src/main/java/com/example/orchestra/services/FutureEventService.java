package com.example.orchestra.services;

import com.example.orchestra.entities.Event;
import com.example.orchestra.entities.FutureEvent;

import java.util.List;

public interface FutureEventService {

    void deleteById(Long id);

    FutureEvent updateFutureEvent(FutureEvent futureEvent);

    public List<FutureEvent> getAllFutureEvents();

//    public void insert(FutureEvent futureEvent);

    FutureEvent findFutureEventById(Long id);

    FutureEvent saveFutureEvent(FutureEvent futureEvent);
}
