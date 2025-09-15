package com.nicholascolon.lil.patientexercisemanager.service;

import com.nicholascolon.lil.patientexercisemanager.dao.PatientRepository;
import com.nicholascolon.lil.patientexercisemanager.dto.PatientDTO;
import com.nicholascolon.lil.patientexercisemanager.entity.Patient;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.util.Optionals;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implements the PatientService defined methods
 */

@Service
public class PatientServiceImpl implements PatientService {

    PatientDTO patientDTO = new PatientDTO();
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
        patientDTO.setFirstName(patient.getFirstName());
        patientDTO.setLastName(patient.getLastName());
        return patientDTO;

        // return saved patient to clinician dashboard

    }

    @Override
    public PatientDTO updatePatient(Patient patient) {


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
