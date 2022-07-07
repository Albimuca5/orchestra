package com.example.orchestra.controllers;

import com.example.orchestra.entities.Event;
import com.example.orchestra.entities.FutureEvent;
import com.example.orchestra.services.EventService;
import com.example.orchestra.services.FutureEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FutureEventController {

    @Autowired
    private FutureEventService futureEventService;

    @GetMapping("/futureEvents")
    public List<FutureEvent> getAllFutureEvents() {
        return futureEventService.getAllFutureEvents();
    }

    @GetMapping("/futureEvent/{id}")
    public FutureEvent getFutureEventById(@PathVariable Long id) {
        return futureEventService.findFutureEventById(id);
    }

    @PostMapping("/addFutureEvent")
    public FutureEvent addFutureEvent(@RequestBody @Valid FutureEvent futureEvent) {
        return futureEventService.saveFutureEvent(futureEvent);
    }

    @DeleteMapping(value = "/futureEventDelete/{id}")
    public ResponseEntity<Void> deleteFutureEvent(@PathVariable Long id) {
        futureEventService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/updateFutureEvent")
    public FutureEvent updateFutureEvent(@RequestBody FutureEvent futureEvent) {
        return futureEventService.updateFutureEvent(futureEvent);
    }
}
