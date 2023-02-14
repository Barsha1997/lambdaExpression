package com.learn.lambda;
@FunctionalInterface
public interface Consumer {
    void consume( String a,float b, int c);
    default   void test(){
        System.out.println("this is test case");

    }
    default void check(){
        System.out.println("this is check case");
    }
}
