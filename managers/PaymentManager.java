package com.gym.managers;

import com.gym.models.Member;

public class PaymentManager {
    public void processPayment(Member member) {
        System.out.println("Processing payment for member: " + member.getName());
        member.getMembership().calculateFee();
    }
}
