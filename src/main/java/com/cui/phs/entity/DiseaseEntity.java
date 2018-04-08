package com.cui.phs.entity;

import java.io.Serializable;
import java.util.List;

public class DiseaseEntity implements Serializable {
    private int id;
    private String name;
    private String description;
    private int imageId;
    private List<ImageEntity> images;
    private String videoUrl;
    private int kindId;

    public DiseaseEntity() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageId() {
        return this.imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public List<ImageEntity> getImages() {
        return this.images;
    }

    public void setImages(List<ImageEntity> images) {
        this.images = images;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public int getKindId() {
        return this.kindId;
    }

    public void setKindId(int kindId) {
        this.kindId = kindId;
    }
}
