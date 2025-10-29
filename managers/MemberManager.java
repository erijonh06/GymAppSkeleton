// ==============================
// File: com/gym/managers/MemberManager.java
// ==============================

package com.gym.managers;

import com.gym.models.Member;
import com.gym.models.Membership;
import java.util.HashMap;
import java.util.Map;

/**
 * SRP: Only manages member data (add, get)
 */
public class MemberManager {
    private Map<String, Member> members = new HashMap<>();

    public void addMember(String name, Membership membership) {
        members.put(name, new Member(name, membership));
        System.out.println("Added member: " + name);
    }

    public Member getMember(String name) {
        Member member = members.get(name);
        if (member == null) throw new IllegalArgumentException("Member not found: " + name);
        return member;
    }
}
