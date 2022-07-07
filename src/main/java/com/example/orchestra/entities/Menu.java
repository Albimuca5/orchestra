package com.example.orchestra.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
public class Menu {

    private String title;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private boolean status;

    @OneToMany
    private List<Menu> submenus;

    private int orderId;

    public Menu() {
    }

    public Menu(long id, boolean status,String title,int orderId) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.orderId = orderId;
    }
}