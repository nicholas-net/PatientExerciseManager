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

    protected Exercise() {}

    public Exercise(String exerciseName, int exerciseRepCount, String exerciseBodyPart) {
        this.name = exerciseName;
        this.repCount = exerciseRepCount;
        this.bodyPart = exerciseBodyPart;
    }





}
