package com.cui.phs.entity;

import java.io.Serializable;

public class DrugEntity implements Serializable {
    private int id;
    private String description;
    private String name;

    public DrugEntity() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
