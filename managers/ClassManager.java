// ==============================
// File: com/gym/managers/ClassManager.java
// ==============================

package com.gym.managers;

import com.gym.models.GymClass;
import com.gym.models.Trainer;
import java.util.HashMap;
import java.util.Map;

/**
 * SRP: Only manages classes and trainer assignments
 * Skeleton implementation: methods declared but not implemented
 */
public class ClassManager {

    private Map<String, GymClass> classes = new HashMap<>();

    public GymClass createClass(String className, String trainerName) {
        // TODO: create GymClass object and store it
        return null;
    }

    public void assignTrainer(String className, Trainer trainer) {
        // TODO: assign trainer to existing GymClass
    }
}
