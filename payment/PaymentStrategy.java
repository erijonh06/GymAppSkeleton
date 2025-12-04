package com.gym.payment;

import com.gym.models.Member;

public interface PaymentStrategy {
    void process(Member member);
}
