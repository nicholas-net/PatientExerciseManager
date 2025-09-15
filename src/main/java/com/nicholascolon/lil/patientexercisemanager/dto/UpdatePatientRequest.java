package com.nicholascolon.lil.patientexercisemanager.dto;

import java.sql.Date;

/***
 * The clinician will be able to update a Patient.
 * This DTO contains only the fields that can be changed
 */
public class UpdatePatientRequest {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String sex;

}
