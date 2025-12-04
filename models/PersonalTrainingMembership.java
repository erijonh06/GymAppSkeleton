package com.gym.models;

/**
 * Adds personal training to an existing Membership.
 */
public class PersonalTrainingMembership extends MembershipDecorator {

    private double extraFee = 20.0; // fee for personal training

    public PersonalTrainingMembership(Membership membership) {
        super(membership);
        this.memberName = membership.memberName; // keep same name
        this.membershipType = membership.membershipType + " + Personal Training";
    }

    @Override
    public void calculateFee() {
        membership.calculateFee();
        // Additional personal training fee calculation
    }

    @Override
    public void displayDetails() {
        membership.displayDetails();
        // Display additional personal training info
    }
}
