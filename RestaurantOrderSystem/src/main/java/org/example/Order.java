package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> orderItems=new ArrayList<>();
    private OrderStatus status;
    public List<OrderItem>  addItem(MenuItem item,int quantity)
    {
        orderItems.add(new OrderItem(item,quantity));
        status=OrderStatus.PLACED;
        return orderItems;
    }
    public BigDecimal subTotal()
    {
        BigDecimal subtotal = BigDecimal.ZERO;
        for(OrderItem item:orderItems)
        {
            subtotal=subtotal.add(item.getitemTotal());
        }
        return subtotal;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public OrderStatus getStatus() {
        return status;
    }


}
