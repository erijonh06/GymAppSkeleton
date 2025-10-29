// ==============================
// File: com/gym/managers/PaymentManager.java
// ==============================

package com.gym.managers;

import com.gym.models.Member;

/**
 * SRP: Only handles payments
 * D: Depends on abstract Membership (Liskov friendly)
 */
public class PaymentManager {
    public void processPayment(Member member) {
        System.out.println("Processing payment for: " + member.getName());
        member.getMembership().calculateFee(); // Polymorphism / Liskov substitution
    }
}
