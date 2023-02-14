package com.learn.stream;

import java.util.ArrayList;
import java.util.List;

public class WithoutStreamApi {
    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(1000,"a"));
        employeeList.add(new Employee(2000,"b"));
        employeeList.add(new Employee(3000,"c"));

        List<Employee> filterList= new ArrayList<>();
        for(Employee e:employeeList){
            if(e.getSalary()>1000){
                filterList.add(e);
            }
        }
        System.out.println("filter list"+ filterList);
    }
}
