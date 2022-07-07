package com.example.orchestra.services;


import com.example.orchestra.entities.Event;
import com.example.orchestra.entities.FutureEvent;
import com.example.orchestra.repositories.FutureEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FutureEventServiceImpl implements FutureEventService {

    @Autowired
    private FutureEventRepository futureEventRepository;

    @Override
    public void deleteById(Long id) {
        futureEventRepository.deleteById(id);
    }

    @Override
    public FutureEvent updateFutureEvent(FutureEvent futureEvent) {
        FutureEvent newFutureEvent = futureEventRepository.getById(futureEvent.getId());

        newFutureEvent.setTitle(futureEvent.getTitle());
        newFutureEvent.setSubject(futureEvent.getSubject());
        newFutureEvent.setDescription(futureEvent.getDescription());
        newFutureEvent.setPhotoUrl(futureEvent.getPhotoUrl());
        newFutureEvent.setButtonUrl(futureEvent.getButtonUrl());
        newFutureEvent.setVideoUrl(futureEvent.getVideoUrl());
        newFutureEvent.setBigDescription(futureEvent.getBigDescription());
        newFutureEvent.setPlace(futureEvent.getPlace());
        newFutureEvent.setOrderId(futureEvent.getOrderId());
        newFutureEvent.setDate(futureEvent.getDate());

        futureEvent = futureEventRepository.save(newFutureEvent);
        return futureEvent;
    }

    @Override
    public List<FutureEvent> getAllFutureEvents() {
        List<FutureEvent> futureEvents = futureEventRepository.findAllByOrderByIdDesc();
        return futureEvents;
    }

    @Override
    public FutureEvent findFutureEventById(Long id) {
        FutureEvent futureEvent = futureEventRepository.findFutureEventById(id);
        return futureEvent;
    }

    @Override
    public FutureEvent saveFutureEvent(FutureEvent futureEvent) {
        return futureEventRepository.save(futureEvent);
    }
}
