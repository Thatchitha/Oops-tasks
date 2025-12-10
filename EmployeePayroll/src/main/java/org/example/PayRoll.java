package org.example;

import java.util.ArrayList;
import java.util.List;

public class PayRoll {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }


    public  void generateReport() {
        System.out.println("Payroll Report:");
        for (Employee e : employees) {
            System.out.println("EmployeeId: "+e.getEmpId()+"Name: "+e.getName()+"Salary: "+e.calcualtePay());

        }

    }

}
