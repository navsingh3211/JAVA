package intro.interfaces;

public class Car implements Engine,Brake,Media{
	
	public void greet() {
		System.out.println("Greeting from car company.");
	}
	@Override
	public void brake() {
		System.out.println("I brake like a normal car");
	}

	@Override
	public void start() {
		System.out.println("I start engine like a normal car");
	}

	@Override
	public void stop() {
		System.out.println("I stop engine like a normal car");
	}

	@Override
	public void acc() {
		System.out.println("I accelerate like a normal car");
	}
	
}
