package com.nicholascolon.lil.patientexercisemanager.dto;

import com.nicholascolon.lil.patientexercisemanager.entity.Exercise;

public class ExerciseDTO {

    private final String name;
    private final int repCount;
    private final String bodyPart;
    private final String imageUrl;

    public ExerciseDTO(String name, int repCount, String bodyPart, String imageUrl) {
        this.name = name;
        this.repCount = repCount;
        this.bodyPart = bodyPart;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public int getRepCount() {
        return repCount;
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
