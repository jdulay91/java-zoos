package com.lambdaschool.zoos.controllers;

import com.lambdaschool.zoos.services.AnimalServices;
import com.lambdaschool.zoos.views.ZooCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalServices animalServices;

    @GetMapping(value="/count", produces = "application/json")
    public ResponseEntity<?> getZooCounts(){
        List<ZooCounts> myList = animalServices.getZooCounts();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }
}
