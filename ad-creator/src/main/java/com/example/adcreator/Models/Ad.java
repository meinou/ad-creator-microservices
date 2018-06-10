package com.example.adcreator.Models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "ADS")
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinTable
    @OneToMany
    private List<Effect> effects;

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

    public List<Effect> getEffects() {
        return effects;
    }

    public void setEffects(List<Effect> effects) {
        this.effects = effects;
    }
}
