package intro.polymorphism;

public class Main {
	public static void main(String[] args) {
		Shapes shape = new Shapes();
		
		//below which method can be accessed from  the object new Circle()
		//depends on the reference type that we have Shapes
		//and which method,it will run defined by object new Circle()
		
		//reference type define which one to access (Shapes)
		//Object type define which one to run (Circle) during overriding
		Shapes circle1 = new Circle();
		
		
		Circle circle2 = new Circle();
		
		Square square = new Square();
		circle1.areas();
	}
}
