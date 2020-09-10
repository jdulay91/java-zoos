package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AnimalServicesImplementation implements AnimalServices {

    @Autowired
    private AnimalRepository animalrepos;
}
