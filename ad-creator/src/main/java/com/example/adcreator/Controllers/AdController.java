package com.example.adcreator.Controllers;

import com.example.adcreator.Models.Ad;
import com.example.adcreator.Repositories.AdRepository;
import com.example.adcreator.Repositories.AdToEffectsRepository;
import com.example.adcreator.Repositories.EffectRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import  org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins = "https://project-3-anna.s3-website-us-east-1.amazonaws.com")
@RestController
public class AdController {

    Logger log = LoggerFactory.getLogger(AdController.class);

    @Autowired
    AdRepository adRepository;

    @Autowired
    EntityManager entityManager;

    @Autowired
    AdToEffectsRepository adToEffectsRepository;

    @Autowired
    EffectRepository effectRepository;

    @RequestMapping("/ads")
    public Iterable<Ad> getAllAds() {
        return adRepository.findAll();
    }

    @PostMapping//("/ads")
    public Ad createNewAd(@RequestBody Ad newAd) {
        Ad ad = new Ad();

        try {
            ad = adRepository.save(newAd);
        } catch (Exception e) {
            log.error("err--", e);
        }
        return ad;
    }


    @PutMapping("/ads/{aid}")
    public Ad updateAd (@PathVariable Long aid, @RequestBody Ad adRequest) {

        Ad adFromDb = adRepository.findOne(aid);
        adFromDb.setClickUrl(adRequest.getClickUrl());
        adFromDb.setCta(adRequest.getCta());
        adFromDb.setImageUrl(adRequest.getImageUrl());
        adFromDb.setEffects(adRequest.getEffects());
        return adRepository.save(adFromDb);
    }

    @GetMapping("/ads/{aid}")
    public Ad getAd (@PathVariable Long aid) {
        return adRepository.findOne(aid);
    }
}
