package org.example;

public class Main {
    public static void main(String[] args) {
        RentalService service=new RentalService();
        service.addVehicle(VehicleFactory.createVehicle("bike", "Activa 125","TN01XY1001", 80));
        service.addVehicle(VehicleFactory.createVehicle("bike", "Activa 125","TN01XY1002",  80));
        service.addVehicle(VehicleFactory.createVehicle("car", "Swift","TN01AB2001",  250));
        service.addVehicle(VehicleFactory.createVehicle("car", "Swift","TN01AB2002",  250));
        service.addVehicle(VehicleFactory.createVehicle("bike", "Pulsar 150","TN01XY1101",  90));
        Customer cust1=new Customer("Ajay","D123");
        Customer cust2 = new Customer("Arun", "DL-9876");
        Customer cust3 = new Customer("Divya", "DL-4567");

        MemberShipService memberShipService=new MemberShipService();
        memberShipService.create(cust1,12);
        memberShipService.create(cust2,12);
        service.rentVehicle("car","Swift",cust1);
        System.out.println(service.returnVehicle("TN01AB2001"));
        service.rentVehicle("car","Swift",cust3);
        System.out.println(service.returnVehicle("TN01AB2001"));


    }
}