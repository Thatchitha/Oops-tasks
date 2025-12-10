package org.example;

import java.time.LocalDateTime;

public class InventoryEvent {
    private String item;
    private int quantity;
    private LocalDateTime time;

    public InventoryEvent(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        this.time = LocalDateTime.now();
    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
