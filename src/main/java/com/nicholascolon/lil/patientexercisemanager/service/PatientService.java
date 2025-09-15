package com.nicholascolon.lil.patientexercisemanager.service;

import com.nicholascolon.lil.patientexercisemanager.dto.CreatePatientRequest;
import com.nicholascolon.lil.patientexercisemanager.entity.Patient;

import java.util.List;

public interface PatientService {

    public abstract CreatePatientRequest savePatient(CreatePatientRequest createPatientRequest);
    public abstract CreatePatientRequest updatePatient(Long id, Patient patient);
    public abstract void deletePatient(Long id);
    public abstract List<CreatePatientRequest> getPatients();
}
