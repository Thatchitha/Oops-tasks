package org.example;

import java.time.LocalDate;

public class Customer {
    private String name;
    private String drivingLicenceNo;
    private MemberShip memberShip;

    public Customer(String name, String drivingLicenceNo) {
        this.name = name;
        this.drivingLicenceNo = drivingLicenceNo;
    }
    public boolean isMember() {
        return memberShip != null && memberShip.isActive();
    }
    public void assignMembership(MemberShip m) {
        this.memberShip = m;
    }

    public String getName() {
        return name;
    }

    public String getDrivingLicenceNo() {
        return drivingLicenceNo;
    }

    public MemberShip getMemberShip() {
        return memberShip;
    }
}
