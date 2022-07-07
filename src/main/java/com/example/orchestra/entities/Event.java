package com.example.orchestra.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@Setter
@Table(name = "event")
@Where(clause = "status = true or status is null")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    private boolean status;
    @NotEmpty
    private String title;
    @NotEmpty
    private String subject;
    @NotEmpty
    private String description;
    @NotEmpty
    private String photoUrl;
    @NotEmpty
    private String buttonUrl;

    private String videoUrl;
    @NotEmpty
    private String bigDescription;

    private String date;
    @NotEmpty
    private String place;

    @Column(name = "order_id")
    private int orderId;

    public Event() {
    }

    public Event(long id, boolean status, String title, String subject, String description, String photoUrl, String buttonUrl, String videoUrl, String bigDescription, String date, String place, int orderId) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.subject = subject;
        this.description = description;
        this.photoUrl = photoUrl;
        this.buttonUrl = buttonUrl;
        this.videoUrl = videoUrl;
        this.bigDescription = bigDescription;
        this.date = date;
        this.place = place;
        this.orderId = orderId;
    }
}
