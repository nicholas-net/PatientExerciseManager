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

    @Column(name = "rep_count")
    private int repCount;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    protected Assignment() {}

    public Assignment(Long assignmentId, int repCount) {
        this.assignmentId = assignmentId;
        this.repCount = repCount;
    }

    public Long getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Long assignmentId) {
        this.assignmentId = assignmentId;
    }
}
