package org.example;

public class CommisionEmployee extends Employee{
    private int sales;
    private double commision;
    public CommisionEmployee(String name,String empId,int sales,double commision)
    {
        super(name,empId);
        this.commision=commision;
        this.sales=sales;
    }
    @Override
    double calcualtePay() {
        return sales*commision;
    }





}
