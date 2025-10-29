// ==============================
// File: com/gym/factory/MembershipFactory.java
// ==============================

package com.gym.factory;

import com.gym.models.Membership;
import com.gym.models.BasicMembership;
import com.gym.models.PremiumMembership;

/**
 * Factory Method Pattern: Creates Membership objects without exposing the logic
 * Open/Closed Principle: Can add new membership types without modifying existing code
 */
public class MembershipFactory {
    public Membership createMembership(String type, String memberName) {
        switch (type.toLowerCase()) {
            case "basic": return new BasicMembership(memberName);
            case "premium": return new PremiumMembership(memberName);
            default: throw new IllegalArgumentException("Unknown membership type: " + type);
        }
    }
}
