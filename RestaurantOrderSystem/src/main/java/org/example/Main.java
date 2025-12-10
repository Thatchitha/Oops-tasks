package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        MenuItem pizza = new MenuItem("Pizza", BigDecimal.valueOf(299.50));
        MenuItem pasta = new MenuItem("Pasta", BigDecimal.valueOf(199.00));
        MenuItem coke  = new MenuItem("Coke",  BigDecimal.valueOf(60.00));
        Order order = new Order();
        order.addItem(pizza, 2);
        order.addItem(pasta, 1);
        order.addItem(coke, 3);
        BillGenerator billGenerator=new BillGenerator(new Dine_In());
        billGenerator.printBill(order);


    }
}