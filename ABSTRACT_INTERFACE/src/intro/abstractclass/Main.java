package intro.abstractclass;

public class Main {
	public static void main(String[] args) {
		Son s = new Son(23);
		s.partner("Sita");
		
		//you can't create object of an abstract class
		//because you can't create constructor of an abstract type
		//we can't create abstract static method
		// we can't create final abstract class
//		Parent mom = new Parent();
	}
}
