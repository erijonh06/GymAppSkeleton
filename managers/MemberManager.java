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
 * Skeleton implementation: methods declared but not implemented
 */
public class MemberManager {

    private Map<String, Member> members = new HashMap<>();

    public void addMember(String name, Membership membership) {
        // TODO: add member to the map
    }

    public Member getMember(String name) {
        // TODO: return member from the map
        return null;
    }
}
