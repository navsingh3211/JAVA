package intro.interfaces.nested;

public class A {
	
	//nested interface
	//nested interface can be decleared as public,private or protected
	//but top label interface has be declared as public or default one
	public interface NestedInterface{
		boolean isOdd(int num);
	}
}

class B implements A.NestedInterface{

	@Override
	public boolean isOdd(int num) {
		return (num & 1) == 1;
	}
	
}

