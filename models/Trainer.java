package com.gym.models;

/**
 * Trainer class with Builder Pattern
 * -----------------------------------
 * Allows flexible creation of Trainer objects.
 */
public class Trainer {

    private String name;
    private String specialty;
    private int experienceYears;  
    private String certification; 

    // Private constructor; only Builder can create instances
    private Trainer(Builder builder) {
        this.name = builder.name;
        this.specialty = builder.specialty;
        this.experienceYears = builder.experienceYears;
        this.certification = builder.certification;
    }

    // Getters
    public String getName() { return name; }
    public String getSpecialty() { return specialty; }
    public int getExperienceYears() { return experienceYears; }
    public String getCertification() { return certification; }

    // -----------------------------
    // Builder Class
    // -----------------------------
    public static class Builder {
        private String name;
        private String specialty;
        private int experienceYears = 0;   // default
        private String certification = ""; // default

        public Builder(String name) {
            this.name = name;
        }

        public Builder setSpecialty(String specialty) {
            this.specialty = specialty;
            return this;
        }

        public Builder setExperienceYears(int years) {
            this.experienceYears = years;
            return this;
        }

        public Builder setCertification(String certification) {
            this.certification = certification;
            return this;
        }

        public Trainer build() {
            return new Trainer(this);
        }
    }
}
