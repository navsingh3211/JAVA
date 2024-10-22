package intro.polymorphism;

public class Circle extends Shapes{
	
	//this will run when object of Circle is created
	// hence it is overriding this parent method
	@Override // this is called annotation
	void areas() {
		System.out.println("Area of circle is : pi*r*r");
	}
}
	