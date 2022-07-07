package com.example.orchestra.entities;

import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;

@Entity
@Where(clause = "status = true or status is null")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String subject;
    private String body;
    private Date dateCreated;
    private Long orderId;
    private Boolean status;

    private String urlButton;
    private String photo;


    public Post() {
    }

    public Post(Long id, String title, String subject, String body, Date dateCreated, Long orderId, Boolean status, String urlButton, String photo) {
        this.id = id;
        this.title = title;
        this.subject = subject;
        this.body = body;
        this.dateCreated = dateCreated;
        this.orderId = orderId;
        this.status = status;

        this.urlButton = urlButton;
        this.photo = photo;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getUrlButton() {
        return urlButton;
    }

    public void setUrlButton(String urlButton) {
        this.urlButton = urlButton;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}