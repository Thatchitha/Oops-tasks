package org.example;

import java.math.BigDecimal;
import java.util.UUID;

public class BillGenerator {
    private String billId=UUID.randomUUID().toString();
    private Billing billing;

    public BillGenerator(Billing billing) {
        this.billing = billing;

    }
    public void printBill(Order order)
    {
        BigDecimal tax = order.subTotal().multiply(BigDecimal.valueOf(0.05));
        BigDecimal tip = order.subTotal().multiply(BigDecimal.valueOf(0.08));
        System.out.println("....Bill....");
        System.out.println("BillId: "+billId);
        System.out.println(order.getOrderItems());
        System.out.println("Subtotal: "+order.subTotal());
        System.out.println("Tax: "+tax);
        System.out.println("Tips: "+tip);
        System.out.println("Total: "+billing.calculateTotal(order.subTotal()));
        if(billing instanceof OnlineOrder onlineOrder)
        {
            System.out.println("Platform fee: "+onlineOrder.platformFee);
            System.out.println("Delivery charge: "+onlineOrder.deliveryFee);
        }
    }

}
