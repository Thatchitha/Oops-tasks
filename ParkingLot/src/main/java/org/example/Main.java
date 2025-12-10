package org.example;

public class Main {
    public static void main(String[] args) {

      ParkingLot parkingLot1=new ParkingLot(3,3,15,10);
      ParkingAlert parkingAlert=new ParkingAlert();
        parkingLot1.getLevels().forEach(l -> l.addObserver(parkingAlert));

      Vehicle v1=new Car("TN1344");
      Vehicle v2=new Bike("TN23900");
      Vehicle v3=new Bike("KL3990");
      Vehicle v4=new Bike("MH29988");
        Vehicle v5=new Bike("MH2988");
      parkingLot1.parkVehicle(v2);
      parkingLot1.parkVehicle(v3);
      parkingLot1.parkVehicle(v4);
      parkingLot1.parkVehicle(v5);
//        System.out.println(parkingLot1.unparkVehicle("TN1344"));





    }
}