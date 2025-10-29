package com.gym.models;

public class Member {
    private String name;
    private Membership membership;
    
    public Member(String name, Membership membership) {
        this.name = name;
        this.membership = membership;
    }
    
    public void bookClass(GymClass gymClass) {
        gymClass.enrollMember(this);
        System.out.println(name + " booked class: " + gymClass.getClassName());
    }
    
    public String getName() { return name; }
    public Membership getMembership() { return membership; }
}
