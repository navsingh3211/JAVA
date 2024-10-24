package intro.interfaces;

public class CdPlayer implements Media {

	@Override	
	public void start() {
		System.out.println("Start Rock music by media player");
	}

	@Override
	public void stop() {
		System.out.println("Stop Rock music by media player");
	}
	
}
