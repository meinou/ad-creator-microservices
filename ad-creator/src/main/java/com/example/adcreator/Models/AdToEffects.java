package com.example.adcreator.Models;

import javax.persistence.*;

@Entity
@Table(name = "AD_EFFECTS")
public class AdToEffects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "AD_ID")
    private Long adId;

    @Column(name = "EFFECT_ID")
    private Long effectId;

    public AdToEffects(){}

    @ManyToMany
    @JoinColumn(name = "ID")
    public Long getAdId() {
        return adId;
    }

    @ManyToMany
    @JoinColumn(name = "ID")
    public Long getEffectId() {
        return effectId;
    }
}






