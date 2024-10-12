package com.intro.staticExample;

public class Main{
	// a static method can access only static data
	//static variable allow to run main without creating object of the current class
    public static void main(String[] args){
        Human kunal = new Human(23,"Kunal",10000,false);
        Human rahul = new Human(30,"Rahul",11000,true);
        
        //when we are using static variable we can access it without referacing the object 
        //or  we can access it directly using class name
        //static variable is not dependent on object
        System.out.println(Human.population);
        System.out.println(Human.population);
//        greeting();
        fun();
        Main obj = new Main();
        obj.greeting();
    }
    
    //this is not dependent on object
    static void fun() {
//    	greeting(); //you can't use this b/c it requires an instance
    	//but the function you are using it in does not depend on instance
    	
    	
    	//you can't access  non-static stuff without referencing their instances in static context
    	Main obj = new Main();
    	obj.greeting();
    
    }
    
    //this is dependent on object
    void greeting() {
//    	fun();
    	System.out.println("non-static method");
    }
}
