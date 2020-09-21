package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Zoo;
import com.lambdaschool.zoos.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "zooServices")
public class ZooServicesImplementation implements ZooServices{
    @Autowired
    private ZooRepository zoorepos;

    @Override
    public List<Zoo> getAllZoos() {
        List<Zoo> list = new ArrayList<>();
        zoorepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Zoo findZooById(long zooid) {
        return zoorepos.findById(zooid).orElseThrow(()-> new EntityNotFoundException("ZOO with id of  " + zooid + " Not Valid"));
    }
}
