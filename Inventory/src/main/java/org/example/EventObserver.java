package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class EventObserver implements InventoryObservor{
    @Override
    public void lowStock(InventoryEvent inventoryEvent) {
        try (FileWriter fw = new FileWriter("inventory-log.txt", true)) {
            fw.write("LOW STOCK Item: " + inventoryEvent.getItem() +
                    ", Qty: " + inventoryEvent.getQuantity() +
                    ", Time: " + inventoryEvent.getTime());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("[Logger] Event written to file.");
    }

}
