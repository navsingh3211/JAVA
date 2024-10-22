package intro.polymorphism;

public class ObjectPrint {
	
	int num;
	
	public ObjectPrint(int num) {
		this.num = num;
	}
	
	//here we are overriding original toString() method
	//At runtime, it will determine that toString method will run
	@Override
	public String toString() {
		return "ObjectPrint{" + "num=" + num + "}" ;
	}
	
	public static void main(String[] args) {
		ObjectPrint obj =  new ObjectPrint(44);
		System.out.println(obj);
	}
}
