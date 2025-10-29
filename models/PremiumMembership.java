package com.gym.models;

public class PremiumMembership extends Membership {
    public PremiumMembership(String memberName) {
        this.memberName = memberName;
        this.membershipType = "Premium";
        this.monthlyFee = 59.99;
    }
    
    @Override
    public void calculateFee() {
        System.out.println("Calculating premium membership fee: $" + monthlyFee);
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Premium Membership for " + memberName + ": $" + monthlyFee + "/month (Includes all features)");
    }
}
