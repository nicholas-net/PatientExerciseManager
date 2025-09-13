package com.nicholascolon.lil.patientexercisemanager.dto;

public class ExerciseDTO {

    private final String name;
    private final int reps;
    private final int sets;
    private final String bodyPart;
    private final String imageUrl;

    public ExerciseDTO(String name, int reps, int sets, String bodyPart, String imageUrl) {
        this.name = name;
        this.reps = reps;
        this.sets = sets;
        this.bodyPart = bodyPart;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public int getReps() {
        return reps;
    }

    public int getSets() {
        return sets;
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
