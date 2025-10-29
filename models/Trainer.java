package com.gym.models;

public class Trainer {
    private String name;
    private String specialty;
    
    public Trainer(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }
    
    public String getName() { return name; }
    public String getSpecialty() { return specialty; }
}
