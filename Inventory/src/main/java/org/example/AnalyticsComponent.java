package org.example;

public class AnalyticsComponent implements InventoryObservor{
    @Override
    public void lowStock(InventoryEvent inventoryEvent) {
        System.out.println("[Analytics] Logged event  " + inventoryEvent.getItem() + " at " + inventoryEvent.getTime());

    }
}
