package com.gym.models;

public abstract class Membership {
    protected String memberName;
    protected String membershipType;
    protected double monthlyFee;
    
    public abstract void calculateFee();
    public abstract void displayDetails();
    
    public String getMemberName() { return memberName; }
    public void setMemberName(String memberName) { this.memberName = memberName; }
    public String getMembershipType() { return membershipType; }
    public double getMonthlyFee() { return monthlyFee; }
}
