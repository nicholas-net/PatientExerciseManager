package com.nicholascolon.lil.patientexercisemanager.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.ArrayList;

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

    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "sex", nullable = false)
    private String sex;

    public Patient() {}

    public Patient(int patientAge, String patientFirstName, String patientLastName, Date dateOfBirth, String sex) {
        this.age = patientAge;
        this.firstName = patientFirstName;
        this.lastName = patientLastName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    /***
     * A patient has many assignments
     * Each assignment links that patient to a specific exercise
     */
    @OneToMany(mappedBy = "patient")
    ArrayList<Assignment> assignments = new ArrayList<>();

}
