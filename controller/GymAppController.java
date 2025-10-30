// ==============================
// File: com/gym/controller/GymAppController.java
// ==============================

package com.gym.controller;

import com.gym.managers.*;
import com.gym.factory.MembershipFactory;
import com.gym.models.*;

/**
 * GymAppController acts as the central coordinator.
 * Skeleton implementation: methods are defined but not implemented.
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
        // TODO: implement registration logic
    }

    public void scheduleClass(String className, String trainerName) {
        // TODO: implement class scheduling logic
    }

    public void assignTrainerToClass(String className, String trainerName) {
        // TODO: implement trainer assignment logic
    }
}
