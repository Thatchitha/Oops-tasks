package org.example;

import java.math.BigDecimal;

public class Dine_In implements Billing {

    @Override
    public BigDecimal calculateTotal(BigDecimal subtotal) {
        BigDecimal tax = subtotal.multiply(BigDecimal.valueOf(0.05));
        BigDecimal tip = subtotal.multiply(BigDecimal.valueOf(0.08));
        return subtotal.add(tax).add(tip);

    }
}
