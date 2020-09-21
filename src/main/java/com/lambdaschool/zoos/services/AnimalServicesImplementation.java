package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.repository.AnimalRepository;
import com.lambdaschool.zoos.views.ZooCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service(value = "animalServices")
public class AnimalServicesImplementation implements AnimalServices {

    @Autowired
    private AnimalRepository animalrepos;

    @Override
    public List<ZooCounts> getZooCounts() {
        List<ZooCounts> list = animalrepos.findZooCounts();
        return list;
    }
}
