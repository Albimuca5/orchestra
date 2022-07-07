package com.example.orchestra.controllers;

import com.example.orchestra.entities.Event;
import com.example.orchestra.entities.FutureEvent;
import com.example.orchestra.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/events")
    public List<Event> getAllEvents(){
        return eventService.getAllEvents();
    }

    @GetMapping("/event/{id}")
    public Event getEventById(@PathVariable Long id) {
        return eventService.findEventById(id);
    }

    @PostMapping("/addEvent")
    public Event addEvent(@RequestBody @Valid Event event){
        return eventService.saveEvent(event);
    }



    @DeleteMapping(value="/eventDelete/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id){
        eventService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/updateEvent")
    public Event updateEvent(@RequestBody Event event){
        return eventService.updateEvent(event);
    }
}
