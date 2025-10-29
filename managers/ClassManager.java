package com.gym.managers;

import com.gym.models.GymClass;
import com.gym.models.Trainer;
import java.util.HashMap;
import java.util.Map;

public class ClassManager {
    private Map<String, GymClass> classes = new HashMap<>();
    
    public GymClass createClass(String className, String trainerName) {
        GymClass gymClass = new GymClass(className, "Schedule TBD", 20);
        classes.put(className, gymClass);
        System.out.println("Created class: " + className);
        return gymClass;
    }
    
    public void assignTrainer(String className, Trainer trainer) {
        GymClass gymClass = classes.get(className);
        if (gymClass != null) {
            gymClass.assignTrainer(trainer);
        }
    }
}
