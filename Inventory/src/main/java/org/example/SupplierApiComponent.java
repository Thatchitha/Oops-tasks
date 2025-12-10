package org.example;

public class SupplierApiComponent implements InventoryObservor{
    @Override
    public void lowStock(InventoryEvent inventoryEvent) {
        System.out.println("[Supplier API] Trigger reorder for " + inventoryEvent.getItem());

    }
}
