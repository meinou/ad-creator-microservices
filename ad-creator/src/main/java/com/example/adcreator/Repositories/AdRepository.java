package com.example.adcreator.Repositories;

import com.example.adcreator.Models.Ad;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdRepository extends CrudRepository<Ad, Long> {
    Iterable<Ad> findAllByUserId(Long userId);
}
