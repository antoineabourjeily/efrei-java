package efrei.td5;

public class LampeLED extends Lampe {
	int nbOfLights;

	@Override
	public void on() {
		System.out.println("LED on");
	}
	
	@Override
	public void off() {
		System.out.println("LED off");
	}
}
