package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Telephone;
import com.lambdaschool.zoos.repository.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TelephoneServicesImplementation implements TelephoneServices{

    @Autowired
    private TelephoneRepository telephonerepos;
}
