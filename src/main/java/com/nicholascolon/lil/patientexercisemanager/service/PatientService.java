package com.nicholascolon.lil.patientexercisemanager.service;

import com.nicholascolon.lil.patientexercisemanager.dto.PatientDTO;
import com.nicholascolon.lil.patientexercisemanager.entity.Patient;

import java.util.List;

public interface PatientService {

    public abstract PatientDTO savePatient(Patient patient);
    public abstract PatientDTO updatePatient(Patient patient);
    public abstract void deletePatient(int id);
    public abstract List<PatientDTO> getPatients();
}
