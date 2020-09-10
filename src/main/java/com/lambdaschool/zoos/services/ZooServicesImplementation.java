package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ZooServicesImplementation implements ZooServices{
    @Autowired
    private ZooRepository zoorepos;
}
