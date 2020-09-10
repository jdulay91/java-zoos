package com.lambdaschool.zoos.models;

import javax.persistence.*;

@Entity
@Table(name = "animals")
public class Animal extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;

    @Column(nullable = false)
    private String animaltype;

}
