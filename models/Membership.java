// ==============================
// File: com/gym/models/Membership.java
// ==============================

package com.gym.models;

/**
 * Abstract base class for all memberships
 * Liskov Substitution: BasicMembership and PremiumMembership can replace this
 */
public abstract class Membership {
    protected String memberName;
    protected String membershipType;
    protected double monthlyFee;

    public abstract void calculateFee();
    public abstract void displayDetails();
}
