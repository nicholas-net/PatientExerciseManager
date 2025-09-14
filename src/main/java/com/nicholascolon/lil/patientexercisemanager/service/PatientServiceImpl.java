package com.nicholascolon.lil.patientexercisemanager.service;

import com.nicholascolon.lil.patientexercisemanager.dao.PatientRepository;
import com.nicholascolon.lil.patientexercisemanager.dto.PatientDTO;
import com.nicholascolon.lil.patientexercisemanager.entity.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implements the PatientService defined methods
 */

@Service
public class PatientServiceImpl implements PatientService {

    Patient patient;
    PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public PatientDTO savePatient(Patient patient) {

        // The Controller provides the service method with the patient that we want to save in the DB
        patientRepository.save(patient);

        // This method will prepare what we want the clinician to see in return
        // PatientDTO is returned back to the Controller
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setFirstName(patient.getFirstName());
        patientDTO.setLastName(patient.getLastName());
        return patientDTO;

        // return saved patient to clinician dashboard

    }

    @Override
    public PatientDTO updatePatient(Patient patient) {
        return null;
    }

    @Override
    public void deletePatient(int id) {

    }

    @Override
    public List<PatientDTO> getPatients() {

    }
}
