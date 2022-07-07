package com.example.orchestra.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@Setter
public class Orchestra {

    @NotEmpty
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String description;

    private String icon;

    private String photo;

    private boolean status;

    public Orchestra() {
    }

    public Orchestra(String name, long id, String description, String icon, String photo, boolean status) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.icon = icon;
        this.photo = photo;
        this.status = status;
    }
}
