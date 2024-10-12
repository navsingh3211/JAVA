package com.intro.singleton;

public class Main {
	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		SingletonClass obj3 = SingletonClass.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		
		//all 3 ref variable are pointing to just one object
	}
}
