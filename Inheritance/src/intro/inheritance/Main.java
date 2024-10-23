package intro.inheritance;

public class Main {
	public static void main(String[] args) {
//		Box box = new Box(4);
//		box.information();
		
//		BoxWeight bw = new BoxWeight(11,5,6,70);
//		System.out.println(bw.h + "-" + bw.l + "-" + bw.weight);
		
		
		//Referencing parent reference to a child class
//		Box box5 = new BoxWeight(11,5,6,70);
//		System.out.println(box5.weight);
		
		
		//Referencing child reference to a parent class
		//there are many variable in parent and child class
		//you are given access to variables that are in the ref type i.e. BoxWeight
		//hence you should have access to weight variable
		//this also means, that the ones you are trying to access should be initialisesd
		//but here ,when the obj itself is of type parent class,
		// how will you call the constructor of child class,this is why error.
		
//		BoxWeight box6 = new Box(11,5,6);
//		System.out.println(box6.weight);
		
		
//		BoxPrice box11 = new BoxPrice(11,58,101.0);
//		System.out.println(box11.cost);
		
		//we can inherite static method but
		//static method can't be overriden
		Box bw = new BoxWeight();
		bw.greeting();
		
		
	}	
}
