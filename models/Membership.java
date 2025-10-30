// ==============================
// File: com/gym/models/Membership.java
// ==============================

package com.gym.models;

/**
 * Skeleton abstract base class for all memberships
 */
public abstract class Membership {

    protected String memberName;
    protected String membershipType;
    protected double monthlyFee;

    public abstract void calculateFee();  // TODO: implement in subclasses
    public abstract void displayDetails(); // TODO: implement in subclasses
}
