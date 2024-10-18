package intro.inheritance;

public class Box {
	 double l;
	double h;
	double w;
	
	Box(){
		this.h = -1;
		this.l = -1;
		this.w = -1;
	}
	
	//cube
	Box(double side){
//		super();
		this.l = side;
		this.w = side;
		this.h = side;
	}
	
	Box(double l,double h,double w){
		this.h = h;
		this.l = l;
		this.w = w;
	}	
	
	//copy constructor
	Box(Box old){
		this.l = old.l;
		this.h = old.h;
		this.w = old.w;
	}
	
	public void information() {
		System.out.println("Running the box " + "height:"+ h);
		System.out.println("width:"+ w);
		System.out.println("length:"+ l);
	}
}
