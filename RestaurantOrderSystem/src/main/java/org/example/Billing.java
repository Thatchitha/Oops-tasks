package org.example;

import java.math.BigDecimal;

public interface Billing {
    BigDecimal calculateTotal(BigDecimal subtotal);

}
