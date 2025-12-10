package org.example;

import java.time.LocalDate;


public class MemberShip {
    private String memberId;
    private LocalDate expiry;

    public MemberShip(String memberId, LocalDate expiry) {
        this.memberId = memberId;
        this.expiry = expiry;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setExpiry(LocalDate expiry) {
        this.expiry = expiry;
    }
    public boolean isActive() {
        return expiry != null && expiry.isAfter(LocalDate.now());
    }

    public void renew(int months) {
        expiry = expiry.plusMonths(months);
    }
}
