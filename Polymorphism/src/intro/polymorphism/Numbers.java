package intro.polymorphism;

public class Numbers {
	double sum(double a,int b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}	
	
	public static void main(String[] args) {
		Numbers num = new Numbers();
		
		//compile time/static polymorphism
		System.out.println(num.sum(1, 2));
		System.out.println(num.sum(1, 2,3));
	}
}
