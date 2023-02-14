/*
Create one FI named "Consumer" with single abstract method called 'consume' and
2 default method called 'test' and 'check'.

in consume method take 3 arguments as String, float and int. consume method will
display calculation of 3 variables, float need to converted int and then sum with int and then concat with String and display. */
package com.learn.lambda;

public class Main {
    public static void main(String[] args) {
       Consumer consumer = (String a, float b,int c)->{
           int covertToFloat = (int)b;
           int sum = covertToFloat+c;
           String r = a+sum;
           System.out.println("result:"+r);
       };
       consumer.test();
       consumer.consume("abc",10.0f,1);
       consumer.check();
    }
}
