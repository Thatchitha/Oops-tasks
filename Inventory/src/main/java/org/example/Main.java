package org.example;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory(10);

        inventory.addObserver(new UIComponent());
        inventory.addObserver(new AnalyticsComponent());
        inventory.addObserver(new SupplierApiComponent());
        inventory.addObserver(new EventObserver());

        inventory.updateStock("Phone", 25);
        inventory.updateStock("Phone", 7);
    }
}