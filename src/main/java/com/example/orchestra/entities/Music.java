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
public class Music {

    private String title;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String singer;
    private String time;
    private int orderId;
    private String photo;
    private boolean status;

    public Music() {
    }

    public Music(String title, long id, String singer, String time, int orderId, String photo) {
        this.title = title;
        this.id = id;
        this.singer = singer;
        this.time = time;
        this.orderId = orderId;
        this.photo = photo;
    }
}
