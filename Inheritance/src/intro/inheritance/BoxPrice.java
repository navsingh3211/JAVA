package intro.inheritance;

public class BoxPrice extends BoxWeight{
	double cost;
	
	BoxPrice(){
		super();
		this.cost = -1;
	}
	
	BoxPrice(BoxPrice other){
		super(other);
		this.cost = other.cost;
	}
	
	public BoxPrice(double l,double h,double w,double weight,double price) {

		super(l,h,w,weight);
		this.cost = price;
	}
	
	public BoxPrice(double side,double weight,double cost) {
		super(side,weight);
		this.cost = cost;
	}
}
