package com.example.adcreator.Models;

import javax.persistence.*;

public class AdEffects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long adAid;

    private Long effectsEid;

    public AdEffects(){}

    @ManyToMany
    @JoinColumn(name = "AID")
    public Long getAdAid() {
        return adAid;
    }

    @ManyToMany
    @JoinColumn(name = "EID")
    public Long getEffectId() {
        return effectsEid;
    }
}
