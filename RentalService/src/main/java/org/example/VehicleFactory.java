package org.example;

public class VehicleFactory {
    public static Vehicle createVehicle(String type,String model,String regId,double rentperHour)
    {
        return switch (type.toLowerCase())
        {
            case "car"->new Car(regId,model,rentperHour);
            case "bike"->new Bike(regId,model,rentperHour);
            default -> throw new IllegalArgumentException("Unknown vehicle");
        };
    }
}
