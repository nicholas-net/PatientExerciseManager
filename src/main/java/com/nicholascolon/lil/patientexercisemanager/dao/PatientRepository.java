package com.nicholascolon.lil.patientexercisemanager.dao;

import com.nicholascolon.lil.patientexercisemanager.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {

    boolean getPatientByIdIsEmpty(Long id);
}
