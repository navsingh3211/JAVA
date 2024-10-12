package com.intro.staticExample;


public class Human{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    
    static void messgae() {
    	System.out.println("Hello World");
//    	System.out.println(this.age);// `this` keyword required object,you can't use it inside static method
    }
    public Human(int age,String name,int salary,boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;
    }
}