package com.gym.controller;

import com.gym.managers.MemberManager;
import com.gym.managers.ClassManager;
import com.gym.managers.PaymentManager;
import com.gym.factory.MembershipFactory;
import com.gym.models.Membership;
import com.gym.models.Member;
import com.gym.models.Trainer;

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
            Membership membership = membershipFactory.createMembership(membershipType, name);
            memberManager.addMember(name, membership);
            Member member = memberManager.getMember(name);
            paymentManager.processPayment(member);
            System.out.println("Member " + name + " registered successfully with " + membershipType + " membership");
        } catch (Exception e) {
            System.err.println("Error registering member: " + e.getMessage());
        }
    }
    
    public void scheduleClass(String className, String trainerName) {
        classManager.createClass(className, trainerName);
        System.out.println("Class " + className + " scheduled with trainer " + trainerName);
    }
    
    public void assignTrainerToClass(String className, String trainerName) {
        Trainer trainer = new Trainer(trainerName, "General");
        classManager.assignTrainer(className, trainer);
        System.out.println("Trainer " + trainerName + " assigned to class " + className);
    }
}
