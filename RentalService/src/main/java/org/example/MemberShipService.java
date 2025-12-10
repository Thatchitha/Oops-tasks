package org.example;

import java.time.LocalDate;
import java.util.UUID;

public class MemberShipService {
    public MemberShip create(Customer customer,int validityMonths)
    {
        String memberId = "MEM-" + UUID.randomUUID().toString().substring(0,6).toUpperCase();
        LocalDate expiry = LocalDate.now().plusMonths(validityMonths);
        MemberShip membership = new MemberShip(memberId, expiry);
        customer.assignMembership(membership);
        return membership;
    }
    public void renewMembership(Customer customer,int months)
    {
        if(customer.getMemberShip()==null)
        {
            throw new RuntimeException("Member not found");
        }
        customer.getMemberShip().renew(months);
        System.out.println("Membership renewed succesfully: "+customer.getName());
    }
}
