package com.gym;

import com.gym.controller.GymAppController;
import com.gym.managers.MemberManager;
import com.gym.managers.ClassManager;
import com.gym.managers.PaymentManager;
import com.gym.factory.MembershipFactory;

public class Main {
    public static void main(String[] args) {
        MembershipFactory factory = new MembershipFactory();
        MemberManager memberManager = new MemberManager();
        ClassManager classManager = new ClassManager();
        PaymentManager paymentManager = new PaymentManager();
        
        GymAppController appController = new GymAppController(
            memberManager, classManager, paymentManager, factory
        );
        
        System.out.println("=== Gym Management System ===");
        appController.registerMember("John Doe", "premium");
        appController.registerMember("Jane Smith", "basic");
        appController.scheduleClass("Yoga Morning", "Alice Johnson");
        appController.assignTrainerToClass("Yoga Morning", "Alice Johnson");
        System.out.println("=== Demo Complete ===");
    }
}
