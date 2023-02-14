package com.learn.assignment.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "RTYA", 80, 23));
        students.add(new Student(2, "OIRA", 100, 44));
        students.add(new Student(3, "POWA", 73, 03));
        students.add(new Student(4, "UYRA", 67, 16));
        students.add(new Student(5, "WQSA", 65, 01));
        students.add(new Student(6, "ADSA", 90, 21));
        students.add(new Student(7, "ACD", 60, 07));


        //1. Filter out a prepare a list of students whom name starts with "A".
        List<Student> stdName = students.stream().filter(student -> student.getStdName().startsWith("A")).collect(Collectors.toList());
        System.out.println(stdName);


        //2. Get all the students roll number as form of list.
        List<Integer> stdRoll = students.stream().map(student -> student.getRollNo()).collect(Collectors.toList());
        System.out.println(stdRoll);

        //3. Find out those students who score less than 75 and put into list.
        List<Student> scoreDetails = students.stream().filter(student -> student.getMarksScore()>75).collect(Collectors.toList());
        System.out.println(scoreDetails);


        //4. Filter out this students roll number is below 10.
        List<Student> rollCase= students.stream().filter(student -> student.getRollNo()<10).toList();
        System.out.println(rollCase);


        //5. Enter a new students object at studId 5.
//            IntStream.range(0,students.size());
//            students.stream().filter(student -> student.getStdId()==5).findFirst();
//            students.forEach((index,);

        OptionalInt i =  IntStream.range(0, students.size()).filter(index->students.get(index).getStdId()==5).findFirst();
        System.out.println(i.getAsInt());
        students.add(4,new Student(8,"anu",80,22));
        System.out.println(students);



        // ######## for findfirst optional is important
        Optional<Student> student = students.stream().filter(student1 -> student1.getRollNo()==07).findFirst();
        if(student.isPresent()){
            Student student1 = student.get();
            System.out.println(student1);
        }
    }
}
