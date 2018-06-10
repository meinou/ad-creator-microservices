package com.example.adcreator.Controllers;

import com.example.adcreator.Models.Ad;
import com.example.adcreator.Models.AdToEffects;
import com.example.adcreator.Repositories.AdRepository;
import com.example.adcreator.Repositories.AdToEffectsRepository;
import com.example.adcreator.Repositories.EffectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AdToEffectController {
    @Autowired
    AdRepository adRepository;

    @Autowired
    EntityManager entityManager;

    @Autowired
    AdToEffectsRepository adToEffectsRepository;

    @Autowired
    EffectRepository effectRepository;

    @RequestMapping("/adsToEffects")
    public Iterable<AdToEffects> getAllAds() {
        return adToEffectsRepository.findAll();
    }
}
