package comparing;

public class Main implements GenericInterface<Integer>{
	public static void main(String[] args) {
		Student kunal = new Student(12,89.76f);
		Student rahul = new Student(14,80.76f);
		if(kunal.compareTo(rahul)<0) {
			System.out.println(kunal.compareTo(rahul));
			System.out.println("Rahul has more marks.");
		}else if(kunal.compareTo(rahul)>0) {
			System.out.println(kunal.compareTo(rahul));
			System.out.println("Kunal has more marks.");
		}else {
			System.out.println("Both has same marks.");
		}
	}

	@Override
	public void display(Integer value) {
		// TODO Auto-generated method stub
		
	}
}
