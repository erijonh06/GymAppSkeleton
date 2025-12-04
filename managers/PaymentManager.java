package com.gym.managers;

import com.gym.models.Member;
import com.gym.payment.PaymentStrategy;

/**
 * SRP: Only handles payments.
 * Uses Strategy Pattern to allow flexible payment processing.
 */
public class PaymentManager {

    private PaymentStrategy strategy;

    // Dependency Injection (constructor)
    public PaymentManager(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(Member member) {
        if (strategy == null) {
            System.out.println("No payment strategy set.");
            return;
        }
        strategy.process(member);
    }
}
