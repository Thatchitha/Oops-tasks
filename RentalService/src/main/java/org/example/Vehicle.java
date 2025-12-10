package org.example;

import java.time.LocalDateTime;

public interface Vehicle {
    String getRegisterId();
    double getRentPerHour();
    boolean isAvailable();
    String getModel();
    String getType();
    void setAvailable(boolean status);


}
