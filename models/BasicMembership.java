package com.gym.models;

public class BasicMembership extends Membership {
    public BasicMembership(String memberName) {
        this.memberName = memberName;
        this.membershipType = "Basic";
        this.monthlyFee = 29.99;
    }
    
    @Override
    public void calculateFee() {
        System.out.println("Calculating basic membership fee: $" + monthlyFee);
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Basic Membership for " + memberName + ": $" + monthlyFee + "/month");
    }
}
