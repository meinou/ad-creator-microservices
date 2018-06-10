package com.example.adcreator.Models;

import javax.persistence.*;

@Entity
@Table(name = "EFFECTS")
public class Effect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "EFFECT_NAME")
    private String name;

    public Effect(){}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
