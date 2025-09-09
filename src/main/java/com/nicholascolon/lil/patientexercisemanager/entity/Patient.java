package com.nicholascolon.lil.patientexercisemanager.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "patients")

public class Patient {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    protected Patient() {}

    public Patient(int patientAge, String patientFirstName, String patientLastName) {
        this.age = patientAge;
        this.firstName = patientFirstName;
        this.lastName = patientLastName;
    }










}
