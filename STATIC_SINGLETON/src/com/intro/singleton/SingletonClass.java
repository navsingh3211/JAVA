package com.intro.singleton;

public class SingletonClass {
	int num = 0;
	private SingletonClass(){
		
	}
	
	private static SingletonClass instance;
	public static SingletonClass getInstance() {
		
		//check whether 1 object only created or not
		if(instance == null) {
			instance = new SingletonClass();
		}
		return instance;
	}
}
