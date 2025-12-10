package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PayRoll payroll=new PayRoll();

        payroll.addEmployee(new SalariedEmployee("Asha","E001",600000,0.5));
        payroll.addEmployee(new HourlyEmployee("Manoj","E002",300,160));
        payroll.addEmployee(new CommisionEmployee("John","E003",35000,0.1));
        payroll.generateReport();
    }
}