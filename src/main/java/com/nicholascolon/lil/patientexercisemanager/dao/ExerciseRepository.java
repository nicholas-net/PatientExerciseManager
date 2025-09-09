package com.nicholascolon.lil.patientexercisemanager.dao;

import com.nicholascolon.lil.patientexercisemanager.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

}
