package com.moneway.test.data.model;

import io.realm.RealmObject;

public class Repositorie extends RealmObject {

    private long id;
    private String name;
    private String description;
    private Owner owner;

    public Repositorie(){}

    public Repositorie(long id, String name, String description, Owner owner) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Owner getOwner() {
        return owner;
    }

}
