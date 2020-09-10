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

    /**
     * Part of the join relationship between user and role
     * connects roles to the user role combination
     */
//    @OneToMany(mappedBy = "role",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true)
//    @JsonIgnoreProperties(value = "role", allowSetters = true)
//    private Set<UserRoles> users = new HashSet<>();


}
