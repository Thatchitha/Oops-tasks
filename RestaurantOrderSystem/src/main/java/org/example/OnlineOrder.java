package org.example;

import java.math.BigDecimal;

public class OnlineOrder implements Billing{
    BigDecimal platformFee;
    BigDecimal deliveryFee;

    public OnlineOrder(BigDecimal platformFee, BigDecimal deliveryFee) {
        this.platformFee = platformFee;
        this.deliveryFee = deliveryFee;
    }


    @Override
    public BigDecimal calculateTotal(BigDecimal subtotal) {
        BigDecimal tax = subtotal.multiply(BigDecimal.valueOf(0.05));
        BigDecimal tip = subtotal.multiply(BigDecimal.valueOf(0.08));
        return subtotal.add(tax).add(tip).add(deliveryFee).add(platformFee);
    }
}
