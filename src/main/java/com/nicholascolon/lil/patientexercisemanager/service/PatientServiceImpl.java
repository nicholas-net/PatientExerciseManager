package com.nicholascolon.lil.patientexercisemanager.service;

import com.nicholascolon.lil.patientexercisemanager.dao.PatientRepository;
import com.nicholascolon.lil.patientexercisemanager.dto.CreatePatientRequest;
import com.nicholascolon.lil.patientexercisemanager.dto.UpdatePatientRequest;
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
    public CreatePatientRequest savePatient(CreatePatientRequest createPatientRequest) {

        Patient patient = new Patient();

        // Controller provides the patientDTO for the function to map to a patient entity to save in the db

        patient.setAge(createPatientRequest.getAge());
        patient.setFirstName(createPatientRequest.getFirstName());
        patient.setLastName(createPatientRequest.getLastName());

        // return saved patient to clinician dashboard

        // Persist patient in db
        patientRepository.save(patient);
        return createPatientRequest;

    }

    // Pass in patient id to extract the patient that needs updating
    @Override
    public UpdatePatientRequest updatePatient(Long id) {

        Optional<Patient> targetPatient = patientRepository.findById(id);





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
    public List<CreatePatientRequest> getPatients() {

    }
}
