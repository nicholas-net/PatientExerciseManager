package com.nicholascolon.lil.patientexercisemanager.entity;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "exercises")

public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "reps", nullable = false)
    private int reps;

    @Column(name = "sets", nullable = false)
    private int sets;

    @Column(name = "body_part", nullable = false)
    private String bodyPart;

    @Column(name = "image_url")
    private String imageUrl;


    protected Exercise() {}

    public Exercise(String exerciseName, int exerciseReps, String exerciseBodyPart, String exerciseImageUrl) {
        this.name = exerciseName;
        this.reps = exerciseReps;
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

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
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

    /***
     * one exercise is assigned to an assignment in the list
     * each one is tied to a patient
     *
     * This will allow the program to give all the assignments by exercise
     */
    @OneToMany(mappedBy = "exercise")
    ArrayList<Assignment> assignments = new ArrayList<>();

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", reps=" + reps +
                ", sets= " + sets +
                ", bodyPart='" + bodyPart + '\'' +
                ", imageURL='" + imageUrl + '\'' +
                '}';
    }



}
