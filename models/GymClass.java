// ==============================
// File: com/gym/models/GymClass.java
// ==============================

package com.gym.models;

public class GymClass {
    private String name;
    private String schedule;
    private int capacity;
    private Trainer trainer;

    public GymClass(String name, String schedule, int capacity) {
        this.name = name;
        this.schedule = schedule;
        this.capacity = capacity;
    }

    public void assignTrainer(Trainer trainer) { this.trainer = trainer; }
}
