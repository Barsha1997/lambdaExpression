package feb13exam.lambda;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> emp = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("enter  name");
            String empName = sc.next();
            System.out.println("enter empId");
            int empId = sc.nextInt();
            System.out.println("enter mobno");
            long mobNo = sc.nextLong();
            System.out.println("enter address");
            String address = sc.next();
            System.out.println("enter salary");
            Float salary = sc.nextFloat();

            emp.add(new Employee(empId, empName, mobNo, address, salary));
        }
        System.out.println(emp);


        //		i.  Short the list based on the empId as natural shorting.
        List<Integer> empIds = emp.stream().map(employee -> employee.getEmpId()).collect(Collectors.toList());
        List<Integer> integers = empIds.stream().sorted().collect(Collectors.toList());
        System.out.println(integers);


        //		ii. Short the list based on the employee salary, address.
        List<Employee> sortedByAddress =emp.stream().sorted((o1,o2)->o1.getAddress().compareTo(o2.getAddress())).collect(Collectors.toList());
        System.out.println(sortedByAddress);


       // List<Employee> sortedBySalary = emp.stream().sorted(emp1->emp1.getSalary()).collect(Collectors.toList());

        //iii.Insert one new employee to list if the salary of the employee is more than all other employee salary in the list.



        //		iv. filter out the list of employees who's salary <= 1000.
        List<Employee> filteredList= emp.stream().filter(employee -> employee.getSalary()<=1000).collect(Collectors.toList());
        System.out.println(filteredList);

        //v.  filter out the list of employees who's mob starts with +91.
       // List<Employee> filterWithMobile = emp.stream().map(employee -> employee.getM)



    }
}
