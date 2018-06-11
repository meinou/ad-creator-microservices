package com.example.adcreator.Controllers;

import com.example.adcreator.Models.Ad;
import com.example.adcreator.Repositories.AdRepository;
import com.example.adcreator.Repositories.AdToEffectsRepository;
import com.example.adcreator.Repositories.EffectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;

//@CrossOrigin(origins = "http://localhost:3000")
//@CrossOrigin(origins = "http://project-3-anna.s3-website-us-east-1.amazonaws.com")
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
    public Iterable<Ad> getAllAds() {
        return adToEffectsRepository.findAll();
    }
}
