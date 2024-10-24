package intro.interfaces;

public class Main {
	public static void main(String[] args) {
//		Car car = new Car();
//		Engine car = new Car();
		
		//while we override and which method will run determine as runtime
//		car.acc();
//		car.start();
//		car.stop();
//		Engine.greet();
//		Media carMedia =  new CdPlayer();
//		carMedia.stop();
		
		
//		NiceCar car = new NiceCar();
//		car.upgradeEngine(new ElectricEngine());
//		car.start();

		NiceCar car = new NiceCar(new ElectricEngine());
		car.start();
		
	}
}
