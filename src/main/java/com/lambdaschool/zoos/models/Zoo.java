package com.lambdaschool.zoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "zoos")
public class Zoo extends Auditable{
    /**
     * The primary key (long) of the roles table.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    /**
     * The name (String) of the role. Cannot be null and must be unique.
     */
    @Column(nullable = false,
            unique = true)
    private String zooname;

    @OneToMany(mappedBy = "zoo",cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties(value="zoo", allowSetters = true)
    private Set<ZooAnimals> animals = new HashSet<>();

    @OneToMany(mappedBy = "zoo",cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties(value="zoo", allowSetters = true)
    private Set<Telephone> telephones = new HashSet<>();

    public Zoo() {
    }

    public Zoo(String zooname) {
        this.zooname = zooname;
    }

    public long getZooid() {
        return zooid;
    }

    public void setZooid(long zooid) {
        this.zooid = zooid;
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }

    public Set<ZooAnimals> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<ZooAnimals> animals) {
        this.animals = animals;
    }

    public Set<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(Set<Telephone> telephones) {
        this.telephones = telephones;
    }
}
