package com.example.adcreator.Repositories;

import com.example.adcreator.Models.Ad;
import org.springframework.data.repository.CrudRepository;

public interface AdRepository extends CrudRepository<Ad, Long> {
}
