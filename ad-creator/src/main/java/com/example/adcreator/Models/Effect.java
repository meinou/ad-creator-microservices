package com.example.adcreator.Models;

import javax.persistence.*;

@Entity
@Table(name = "EFFECT")
public class Effect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eid;

    private String name;

    public Effect(){}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getEid() {
        return eid;
    }
}
