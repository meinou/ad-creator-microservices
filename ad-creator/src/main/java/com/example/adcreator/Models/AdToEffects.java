package com.example.adcreator.Models;

import javax.persistence.*;

@Entity
@Table(name = "EFFECTS")
public class AdToEffects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "AD_ID")
    private Long adId;

    @Column(name = "EFFECT_ID")
    private Long effectId;

}
