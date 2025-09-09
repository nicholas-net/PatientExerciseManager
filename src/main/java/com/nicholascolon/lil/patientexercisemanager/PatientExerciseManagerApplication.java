package com.nicholascolon.lil.patientexercisemanager;

import com.nicholascolon.lil.patientexercisemanager.dao.PatientRepository;
import com.nicholascolon.lil.patientexercisemanager.entity.Patient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PatientExerciseManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientExerciseManagerApplication.class, args);
    }

}
