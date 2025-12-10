package org.example;

import java.time.LocalDateTime;
import java.util.*;

public class Inventory {
    private  Map<String, Integer> stock = new HashMap<>();
    private  List<InventoryObservor> observers = new ArrayList<>();
    private  int threshold;
    private Set<String> alreadyAlerted=new HashSet<>();
    public Inventory(int threshold) {
        this.threshold = threshold;
    }
    public void addObserver(InventoryObservor observer) {
        observers.add(observer);
    }
    private void notifyObservers(InventoryEvent event) {
        for (InventoryObservor o : observers) {
            o.lowStock(event);
        }
    }

    public void updateStock(String item, int quantity) {
        stock.put(item, quantity);

        if (quantity < threshold&&(!alreadyAlerted.contains(item))) {
            alreadyAlerted.add(item);
            notifyObservers(new InventoryEvent(item, quantity));
        }
        if (quantity >= threshold) {
            alreadyAlerted.remove(item);
        }
    }

}
