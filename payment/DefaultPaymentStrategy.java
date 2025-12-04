package com.gym.payment;

import com.gym.models.Member;
import com.gym.models.Membership;

public class DefaultPaymentStrategy implements PaymentStrategy {

    @Override
    public void process(Member member) {
        Membership membership = member.getMembership();

        if (membership == null) {
            System.out.println("No membership assigned to member: " + member.getName());
            return;
        }

        double fee = membership.calculateFee();
        System.out.println("Processing default fee payment for " 
                + member.getName() + ": €" + fee);
    }
}
