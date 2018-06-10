package com.example.adcreator.Models;

import javax.persistence.*;


@Entity
@Table(name = "ADS")
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="TEXT")
    private String text;

    @Column(name = "URL_CLICK")
    private String urlToClick;

    @Column(name = "USER_ID")
    private Long userId;

    public Ad(){}

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getText() {
        return text;
    }

    public String getUrlToClick() {
        return urlToClick;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUrlToClick(String urlToClick) {
        this.urlToClick = urlToClick;
    }
}
