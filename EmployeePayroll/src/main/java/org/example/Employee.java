package org.example;

public abstract class Employee {
    private String name;
    private String empId;

    public Employee(String name, String empId) {
        this.name = name;
        this.empId = empId;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    abstract double calcualtePay();


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }
}
