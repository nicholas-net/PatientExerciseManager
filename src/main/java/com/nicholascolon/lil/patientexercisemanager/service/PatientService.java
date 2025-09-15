package com.nicholascolon.lil.patientexercisemanager.service;

import com.nicholascolon.lil.patientexercisemanager.dto.PatientDTO;
import com.nicholascolon.lil.patientexercisemanager.entity.Patient;

import java.util.List;

public interface PatientService {

    public abstract PatientDTO savePatient(PatientDTO patientDTO);
    public abstract PatientDTO updatePatient(Long id, Patient patient);
    public abstract void deletePatient(Long id);
    public abstract List<PatientDTO> getPatients();
}
