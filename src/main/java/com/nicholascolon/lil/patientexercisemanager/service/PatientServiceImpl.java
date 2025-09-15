package com.nicholascolon.lil.patientexercisemanager.service;

import com.nicholascolon.lil.patientexercisemanager.dao.PatientRepository;
import com.nicholascolon.lil.patientexercisemanager.dto.CreateClientRequest;
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
    public CreateClientRequest savePatient(CreateClientRequest createClientRequest) {

        Patient patient = new Patient();

        // Controller provides the patientDTO for the function to map to a patient entity to save in the db

        patient.setAge(createClientRequest.getAge());
        patient.setFirstName(createClientRequest.getFirstName());
        patient.setLastName(createClientRequest.getLastName());

        // return saved patient to clinician dashboard

        // Persist patient in db
        patientRepository.save(patient);
        return createClientRequest;

    }

    // Pass in patient object with updated attributes to be saved
    @Override
    public CreateClientRequest updatePatient(Long id, ) {

        Optional<Patient> patient = patientRepository.findById(id);



    }

    @Override
    public void deletePatient(Long id) throws EntityNotFoundException {

        // Tells the program that this container may or may not contain an object
        Optional<Patient> patient = patientRepository.findById(id);

        if (patient.isEmpty()) {
            throw new EntityNotFoundException("Patient not found.");
        } else {
            patientRepository.deleteById(id);
        }
    }

    @Override
    public List<CreateClientRequest> getPatients() {

    }
}
