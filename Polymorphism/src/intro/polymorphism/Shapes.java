package intro.polymorphism;

public class Shapes {
	void areas() {
		System.out.println("In in shape class");
	}
	
	
	//we can't override below method
	//Early binding:At runtime it determine that this method will run or not
//	final void areas() {
//		System.out.println("In in shape class");
//	}
}
