package com.example.orchestra.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Caorusel {

    private String title;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String description;
    private int orderId;
    private String photoUrl;
    private boolean status;

    public Caorusel() {
    }

    public Caorusel(String title,String description, long id, int orderId, String photoUrl) {
        this.title = title;
        this.id = id;
        this.description = description;
        this.orderId = orderId;
        this.photoUrl = photoUrl;
    }
}
