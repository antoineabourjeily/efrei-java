package efrei.td5;

public class LampeAIncandescence extends Lampe {
	@Override
	public void on() {
		System.out.println("Filament on");
	}
	
	@Override
	public void off() {
		System.out.println("Filament off");
		super.off();
	}
}