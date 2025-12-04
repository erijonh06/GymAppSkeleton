package com.gym;

import com.gym.controller.GymAppController;
import com.gym.managers.MemberManager;
import com.gym.managers.ClassManager;
import com.gym.managers.PaymentManager;
import com.gym.factory.MembershipFactory;

// Strategy imports
import com.gym.payment.PaymentStrategy;
import com.gym.payment.DefaultPaymentStrategy;

// Decorator imports
import com.gym.models.Membership;
import com.gym.models.PersonalTrainingMembership;

public class Main {

    public static void main(String[] args) {

        // -----------------------------
        // Initialize managers and factory
        // -----------------------------
        MembershipFactory factory = new MembershipFactory();
        MemberManager memberManager = new MemberManager();
        ClassManager classManager = new ClassManager();

        // -----------------------------
        // Strategy Pattern: PaymentManager
        // -----------------------------
        PaymentStrategy defaultStrategy = new DefaultPaymentStrategy();
        PaymentManager paymentManager = new PaymentManager(defaultStrategy);

        // -----------------------------
        // Initialize controller (Facade-like)
        // -----------------------------
        GymAppController appController = new GymAppController(
            memberManager, classManager, paymentManager, factory
        );

        System.out.println("=== Gym Management System ===");

        // -----------------------------
        // Register members (Factory + Decorator)
        // -----------------------------

        // John Doe: Premium membership (no decorator)
        appController.registerMember("John Doe", "premium");

        // Jane Smith: Basic membership wrapped with Personal Training (Decorator)
        Membership basicMembership = factory.createMembership("basic", "Jane Smith");
        Membership decoratedMembership = new PersonalTrainingMembership(basicMembership);
        memberManager.addMember("Jane Smith", decoratedMembership);

        // -----------------------------
        // Schedule classes and assign trainers (Observer + Builder)
        // -----------------------------
        appController.scheduleClass("Yoga Morning", "Alice Johnson");
        appController.assignTrainerToClass("Yoga Morning", "Alice Johnson");

        System.out.println("=== Demo Complete ===");
    }
}
