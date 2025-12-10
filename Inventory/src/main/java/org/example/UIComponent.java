package org.example;

public class UIComponent implements InventoryObservor{
    @Override
    public void lowStock(InventoryEvent inventoryEvent) {
        System.out.println("[UI] LOW STOCK ALERT " + inventoryEvent.getItem() + " qty=" + inventoryEvent.getQuantity());

    }
}
