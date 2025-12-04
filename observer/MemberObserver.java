package com.gym.observer;

import com.gym.models.Member;

/**
 * MemberObserver
 * ------------------------------
 * Adapts a Member object into an Observer.
 * This allows members to subscribe to class notifications.
 * 
 * When a GymClass sends an update, the message is printed with
 * the member's name to simulate notification delivery.
 */
public class MemberObserver implements Observer {

    private Member member;

    public MemberObserver(Member member) {
        this.member = member;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + member.getName() + ": " + message);
    }
}
