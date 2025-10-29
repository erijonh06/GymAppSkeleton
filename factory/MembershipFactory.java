package com.gym.factory;

import com.gym.models.Membership;
import com.gym.models.BasicMembership;
import com.gym.models.PremiumMembership;

public class MembershipFactory {
    public Membership createMembership(String type, String memberName) {
        switch (type.toLowerCase()) {
            case "basic":
                return new BasicMembership(memberName);
            case "premium":
                return new PremiumMembership(memberName);
            default:
                throw new IllegalArgumentException("Unknown membership type: " + type);
        }
    }
}
