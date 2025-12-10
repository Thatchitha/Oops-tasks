package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public class Billing {
    public double calculate(RentalRecord record) {
        long hours = Duration.between(record.getStartTime(), LocalDateTime.now()).toHours();
        if (hours < 1) hours = 1;

        double cost = hours * record.getVehicle().getRentPerHour();

        if(record.getCustomer().isMember())
            cost *= 0.90;

        return cost;
    }
}
