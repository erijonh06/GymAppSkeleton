package com.gym.models;

import com.gym.observer.Observer;
import com.gym.observer.Subject;
import java.util.ArrayList;
import java.util.List;

/**
 * GymClass
 * ----------------------------
 * Minimal implementation of GymClass with Observer support.
 * Notifies subscribed members when trainer or schedule changes.
 */
public class GymClass implements Subject {

    private String name;
    private String schedule;
    private int capacity;
    private Trainer trainer;

    // Observers (subscribed members)
    private List<Observer> observers = new ArrayList<>();

    public GymClass(String name, String schedule, int capacity) {
        this.name = name;
        this.schedule = schedule;
        this.capacity = capacity;
    }

    /**
     * Assign a trainer and notify observers.
     */
    public void assignTrainer(Trainer trainer) {
        this.trainer = trainer;
        notifyObservers("Trainer " + trainer.getName() + " has been assigned to class " + name);
    }

    /**
     * Update schedule and notify observers.
     */
    public void updateSchedule(String newSchedule) {
        this.schedule = newSchedule;
        notifyObservers("Schedule updated for class " + name + ": " + newSchedule);
    }

    // --- Observer Pattern Methods ---
    @Override
    public void addObserver(Observer observer) { observers.add(observer); }

    @Override
    public void removeObserver(Observer observer) { observers.remove(observer); }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Getters
    public String getName() { return name; }
    public String getSchedule() { return schedule; }
    public int getCapacity() { return capacity; }
    public Trainer getTrainer() { return trainer; }
}
