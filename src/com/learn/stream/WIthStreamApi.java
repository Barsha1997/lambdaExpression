package com.learn.stream;

import java.util.*;
import java.util.stream.Collectors;

public class WIthStreamApi {
    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(1000,"b"));
        employeeList.add(new Employee(1000,"a"));
        employeeList.add(new Employee(3000,"c"));

        List<Employee> filteredList = employeeList.stream().filter(employee -> employee.getSalary()>1000).collect(Collectors.toList());
        System.out.println(filteredList);


        //intermediate operations  example
        //i.map

        List<Integer> number= Arrays.asList(2,3,4);
        //find out square of each number
        List<Integer> square = number.stream().map(n->n*n).collect(Collectors.toList());
        //System.out.println(square);

        //find the list of employee name
        List<String> empName = employeeList.stream().map(emp->emp.getEmpName()).collect(Collectors.toList());
        //System.out.println(empName);

        List<Integer> empSalaryList= employeeList.stream().map(employee->employee.getSalary()).collect(Collectors.toList());
        //System.out.println(empSalaryList);

        //find out unique salarydetails of employee
        Set<Integer> uniqueSalary = employeeList.stream().map(employee->employee.getSalary()).collect(Collectors.toSet());

        //create a map of emp name connected with salary
        Map<String,Integer> empMap = employeeList.stream().collect(Collectors.toMap(emp->emp.getEmpName(),emp->emp.getSalary()));
        System.out.println(empMap);

        //ii. filter

        List<String> stringList = Arrays.asList("Tests","Reflection", "Tag");
        System.out.println(stringList);
        //find out list of String whose values starts with T
        List<String> convStringList = stringList.stream().filter(s -> s.startsWith("T")).collect(Collectors.toList());
        //System.out.println(convStringList);

        //find out set/list of employee whose salary is more than 100000
        List<Employee> filteredList1 = employeeList.stream().filter(employee -> (employee.getSalary() > 100000))
                .collect(Collectors.toList());
        //System.out.println("Filtered List : "+filteredList1);








        //ii.filter
        List<Integer> integers = Arrays.asList(4,2,7,4,8,9,11);

        List<Integer> sortedInteger = integers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedInteger);

        System.out.println("before sorting::"+employeeList);

        List<Employee> sortedEmployee = employeeList.stream().sorted((o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName())).collect(Collectors.toList());
        System.out.println("after sorting::"+sortedEmployee);
    }
}
