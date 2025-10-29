package com.gym.models;

import java.util.ArrayList;
import java.util.List;

public class GymClass {
    private String className;
    private String schedule;
    private int capacity;
    private Trainer trainer;
    private List<Member> enrolledMembers = new ArrayList<>();
    
    public GymClass(String className, String schedule, int capacity) {
        this.className = className;
        this.schedule = schedule;
        this.capacity = capacity;
    }
    
    public void assignTrainer(Trainer trainer) {
        this.trainer = trainer;
        System.out.println("Trainer " + trainer.getName() + " assigned to " + className);
    }
    
    public void enrollMember(Member member) {
        if (enrolledMembers.size() < capacity) {
            enrolledMembers.add(member);
            System.out.println("Member " + member.getName() + " enrolled in " + className);
        } else {
            System.out.println("Class " + className + " is full. Cannot enroll " + member.getName());
        }
    }
    
    public String getClassName() { return className; }
    public String getSchedule() { return schedule; }
    public int getCapacity() { return capacity; }
}
