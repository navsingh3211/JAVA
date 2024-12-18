package com.intro.staticExample;

//Demo to show initialization of static variables
public class StaticBlock {
	static int a = 4;
	static int b;
	
	//will only run once, when the first obj is created,
	// i.e when the class is loaded for first
	static {
		System.out.println("I am in static block");
		b = a*5;
	}
	
	public static void main(String[] args) {
		StaticBlock obj = new StaticBlock();
		System.out.println(StaticBlock.a + " " + StaticBlock.b);
		
		StaticBlock.a +=3;
		System.out.println(StaticBlock.a + " " + StaticBlock.b);
		
		StaticBlock obj2 = new StaticBlock();
		System.out.println(StaticBlock.a + " " + StaticBlock.b);
	}
}
