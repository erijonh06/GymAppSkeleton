package com.gym.models;

/**
 * Abstract Decorator for Membership
 * ---------------------------------
 * Wraps a Membership and allows adding extra features dynamically.
 */
public abstract class MembershipDecorator extends Membership {

    protected Membership membership; // The wrapped membership

    public MembershipDecorator(Membership membership) {
        this.membership = membership;
    }

    @Override
    public abstract void calculateFee();

    @Override
    public abstract void displayDetails();
}
