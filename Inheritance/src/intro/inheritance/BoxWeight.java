package intro.inheritance;

public class BoxWeight extends Box {
	double weight;
	
	public BoxWeight() {
		this.weight = -1;
		this.h = 3;
	}
	
	BoxWeight(double side,double weight){
		super(side);
		this.weight = weight;
	}
	
	BoxWeight(BoxWeight other){
		super(other);
		weight = other.weight;
	}
	
	public BoxWeight(double l,double h,double w,double weight) {
		
		//what is this? --> call the parent class constructor
		//used to initialize value present in parent class
		super(l,h,w);
		this.weight = weight;
	}
}
