package com.nicholascolon.lil.patientexercisemanager.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "exercises")

public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "rep_count")
    private int repCount;

    @Column(name = "body_part")
    private String bodyPart;

    @Column(name = "image_url")
    private String imageUrl;


    protected Exercise() {}

    public Exercise(String exerciseName, int exerciseRepCount, String exerciseBodyPart, String exerciseImageUrl) {
        this.name = exerciseName;
        this.repCount = exerciseRepCount;
        this.bodyPart = exerciseBodyPart;
        this.imageUrl = exerciseImageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRepCount() {
        return repCount;
    }

    public void setRepCount(int repCount) {
        this.repCount = repCount;
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    public String getImageURL() {
        return imageUrl;
    }

    public void setImageURL(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", repCount=" + repCount +
                ", bodyPart='" + bodyPart + '\'' +
                ", imageURL='" + imageUrl + '\'' +
                '}';
    }



}
