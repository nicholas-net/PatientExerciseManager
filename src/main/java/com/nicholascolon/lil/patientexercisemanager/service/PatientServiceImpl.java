package com.nicholascolon.lil.patientexercisemanager.service;

import com.nicholascolon.lil.patientexercisemanager.dao.PatientRepository;
import com.nicholascolon.lil.patientexercisemanager.dto.PatientDTO;
import com.nicholascolon.lil.patientexercisemanager.entity.Patient;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implements the PatientService defined methods
 */

@Service
public class PatientServiceImpl implements PatientService {

    PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public PatientDTO savePatient(PatientDTO patientDTO) {

        Patient patient = new Patient();

        // Controller provides the patientDTO for the function to map to a patient entity to save in the db

        patient.setAge(patientDTO.getAge());
        patient.setFirstName(patientDTO.getFirstName());
        patient.setLastName(patientDTO.getLastName());

        // return saved patient to clinician dashboard

        // Persist patient in database
        patientRepository.save(patient);
        return patientDTO;

    }

    @Override
    public PatientDTO updatePatient(Long id, Patient patient) {

    }

    @Override
    public void deletePatient(Long id) throws EntityNotFoundException {

        Optional<Patient> patient = patientRepository.findById(id);

        if (patient.isEmpty()) {
            throw new EntityNotFoundException("Patient not found.");
        } else {
            patientRepository.deleteById(id);
        }
    }

    @Override
    public List<PatientDTO> getPatients() {

    }
}
