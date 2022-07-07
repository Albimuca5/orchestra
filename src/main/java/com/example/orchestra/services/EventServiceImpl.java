package com.example.orchestra.services;

import com.example.orchestra.entities.Event;
import com.example.orchestra.entities.FutureEvent;
import com.example.orchestra.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService{

    @Autowired
    private EventRepository eventRepository;

    @Override
    public void deleteById(Long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public Event updateEvent(Event event) {

        Event newEvent = eventRepository.getById(event.getId());

        newEvent.setTitle(event.getTitle());
        newEvent.setSubject(event.getSubject());
        newEvent.setDescription(event.getDescription());
        newEvent.setPhotoUrl(event.getPhotoUrl());
        newEvent.setButtonUrl(event.getButtonUrl());
        newEvent.setVideoUrl(event.getVideoUrl());
        newEvent.setBigDescription(event.getBigDescription());
        newEvent.setPlace(event.getPlace());
        newEvent.setOrderId(event.getOrderId());
        newEvent.setDate(event.getDate());

        event = eventRepository.save(newEvent);
        return event;
    }

    @Override
    public List<Event> getAllEvents() {
        List<Event> events = eventRepository.findAllByOrderByIdDesc();
        return events;
    }

    @Override
    public Event findEventById(Long id) {
        Event event = eventRepository.findEventById(id);
        return event;
    }

    @Override
    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }
}
