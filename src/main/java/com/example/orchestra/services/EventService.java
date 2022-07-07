package com.example.orchestra.services;

import com.example.orchestra.entities.Event;
import com.example.orchestra.entities.FutureEvent;
import com.example.orchestra.entities.Post;

import java.util.List;

public interface EventService {

    void deleteById(Long id);

    Event updateEvent(Event event);

    public List<Event> getAllEvents();

    Event findEventById(Long id);

    Event saveEvent(Event event);
}
