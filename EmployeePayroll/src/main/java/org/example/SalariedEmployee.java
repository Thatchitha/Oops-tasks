package org.example;

public class SalariedEmployee extends Employee{
    private double salary;
    private double tax;
    public SalariedEmployee(String name,String empId,double salary,double tax)
    {
        super(name,empId);
        this.salary=salary;
        this.tax=tax;
    }

    @Override
    double calcualtePay() {
        double gross=salary;

        return gross-(gross*tax);
    }




}
