package com.cui.phs.entity;

import java.io.Serializable;

public class CaseEntity implements Serializable {
    private int id;
    private int dId;
    private int imageId;
    private String description;
    private String name;

    public CaseEntity() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getdId() {
        return this.dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public int getImageId() {
        return this.imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
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
