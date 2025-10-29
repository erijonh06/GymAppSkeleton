// ==============================
// File: com/gym/controller/GymAppController.java
// ==============================

package com.gym.controller;

import com.gym.managers.*;
import com.gym.factory.MembershipFactory;
import com.gym.models.*;

/**
 * GymAppController acts as the central coordinator.
 * SOLID Principles:
 * - SRP: Only coordinates managers and factory.
 * - D: Depends on abstractions via injected managers, not concrete logic.
 */
public class GymAppController {

    private MemberManager memberManager;
    private ClassManager classManager;
    private PaymentManager paymentManager;
    private MembershipFactory membershipFactory;

    public GymAppController(MemberManager memberManager,
                            ClassManager classManager,
                            PaymentManager paymentManager,
                            MembershipFactory membershipFactory) {
        this.memberManager = memberManager;
        this.classManager = classManager;
        this.paymentManager = paymentManager;
        this.membershipFactory = membershipFactory;
    }

    public void registerMember(String name, String membershipType) {
        try {
            // Factory Method Pattern: creates membership
            Membership membership = membershipFactory.createMembership(membershipType, name);

            memberManager.addMember(name, membership); // SRP: memberManager handles storage
            Member member = memberManager.getMember(name);

            paymentManager.processPayment(member); // Delegation
            System.out.println("Member " + name + " registered successfully with " + membershipType + " membership");
        } catch (Exception e) {
            System.err.println("Error registering member: " + e.getMessage());
        }
    }

    public void scheduleClass(String className, String trainerName) {
        classManager.createClass(className, trainerName); // SRP
        System.out.println("Class " + className + " scheduled with trainer " + trainerName);
    }

    public void assignTrainerToClass(String className, String trainerName) {
        Trainer trainer = new Trainer(trainerName, "General"); // Builder pattern could be applied later
        classManager.assignTrainer(className, trainer);
        System.out.println("Trainer " + trainerName + " assigned to class " + className);
    }
}
