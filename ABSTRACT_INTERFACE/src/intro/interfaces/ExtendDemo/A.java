package intro.interfaces.ExtendDemo;

public interface A {
	void fun();
	
	//Static interface methods should always  have a body
	// call vai the interface  name
	static void greeting() {
		System.out.println("hy i am static method");
	}
}
