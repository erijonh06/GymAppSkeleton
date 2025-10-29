// ==============================
// File: com/gym/models/Member.java
// ==============================

package com.gym.models;

public class Member {
    private String name;
    private Membership membership;

    public Member(String name, Membership membership) {
        this.name = name;
        this.membership = membership;
    }

    public String getName() { return name; }
    public Membership getMembership() { return membership; }
}
