package org.example;

public class HourlyEmployee extends Employee{
    private double hoursWorked;
    private double wagePerHour;
    public HourlyEmployee(String name,String empId,double hoursWorked,double wagePerHour)
    {
        super(name,empId);
        this.hoursWorked=hoursWorked;
        this.wagePerHour=wagePerHour;
    }
    @Override
    double calcualtePay() {
        return hoursWorked*wagePerHour;
    }




}
