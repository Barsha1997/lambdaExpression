package com.learn.stream;

public class Employee {
    public Employee(int salary, String empName) {
        this.salary = salary;
        this.empName = empName;
    }

    private int salary;
    private  String empName;

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", empName='" + empName + '\'' +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int empId) {
        this.salary = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }


}
