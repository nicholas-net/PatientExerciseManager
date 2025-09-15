package com.nicholascolon.lil.patientexercisemanager.service;

import com.nicholascolon.lil.patientexercisemanager.dto.CreateClientRequest;
import com.nicholascolon.lil.patientexercisemanager.entity.Patient;

import java.util.List;

public interface PatientService {

    public abstract CreateClientRequest savePatient(CreateClientRequest createClientRequest);
    public abstract CreateClientRequest updatePatient(Long id, Patient patient);
    public abstract void deletePatient(Long id);
    public abstract List<CreateClientRequest> getPatients();
}
