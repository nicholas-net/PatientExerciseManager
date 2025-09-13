package com.nicholascolon.lil.patientexercisemanager.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
/***
 * Each Assignment row represents one patient that is assigned one exercise
 * Rep counts can differ per patient
 * When we want all the exercises for a specific patient or all the exercises for a specific patient, we will query multiple assignments
 */

@Entity
@Table(name = "patient_exercises")

public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long assignmentId;

    @Column(name = "reps")
    private int reps;

    @Column(name = "sets")
    private int sets;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    protected Assignment() {}

    public Assignment(Long assignmentId, int reps, int sets) {
        this.assignmentId = assignmentId;
        this.reps = reps;
        this.sets = sets;
    }

    public Long getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Long assignmentId) {
        this.assignmentId = assignmentId;
    }
}
