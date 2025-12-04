package com.gym.managers;

import com.gym.models.GymClass;
import com.gym.models.Trainer;
import com.gym.models.Member;
import com.gym.observer.MemberObserver;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassManager
 * ----------------------------
 * SRP: Only manages GymClass objects and trainer assignments.
 * Now also supports the Observer Pattern to notify subscribed members
 * when a trainer is assigned or the class schedule changes.
 */
public class ClassManager {

    // Map of className → GymClass
    private Map<String, GymClass> classes = new HashMap<>();

    /**
     * Creates a new GymClass and stores it.
     * @param className name of the class
     * @param trainerName name of the trainer (initial assignment optional)
     * @return the created GymClass object
     */
    public GymClass createClass(String className, String trainerName) {
        GymClass gymClass = new GymClass(className, "Schedule TBD", 20);

        // Optional: assign initial trainer
        if (trainerName != null && !trainerName.isEmpty()) {
            Trainer trainer = new Trainer(trainerName, "General"); // default specialty
            gymClass.assignTrainer(trainer); // Observer will notify subscribers if any
        }

        classes.put(className, gymClass);
        System.out.println("Created class: " + className);
        return gymClass;
    }

    /**
     * Assigns a trainer to an existing GymClass.
     * @param className name of the class
     * @param trainer the Trainer object to assign
     */
    public void assignTrainer(String className, Trainer trainer) {
        GymClass gymClass = classes.get(className);
        if (gymClass != null) {
            gymClass.assignTrainer(trainer); // triggers notifications
            System.out.println("Trainer " + trainer.getName() + " assigned to class " + className);
        } else {
            System.out.println("Class not found: " + className);
        }
    }

    /**
     * Subscribes a member to a class to receive notifications (Observer Pattern)
     * @param className name of the class
     * @param member member to subscribe
     */
    public void subscribeMemberToClass(String className, Member member) {
        GymClass gymClass = classes.get(className);
        if (gymClass != null) {
            gymClass.addObserver(new MemberObserver(member));
            System.out.println(member.getName() + " subscribed to updates for " + className);
        } else {
            System.out.println("Class not found: " + className);
        }
    }

    /**
     * Optional: update class schedule
     */
    public void updateClassSchedule(String className, String newSchedule) {
        GymClass gymClass = classes.get(className);
        if (gymClass != null) {
            gymClass.updateSchedule(newSchedule); // notifies subscribers
            System.out.println("Schedule updated for class " + className + ": " + newSchedule);
        } else {
            System.out.println("Class not found: " + className);
        }
    }
}
