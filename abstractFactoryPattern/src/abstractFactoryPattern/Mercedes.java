package abstractFactoryPattern;

public class Mercedes implements Vehicle{
	
	@Override
	public void average() {
		System.out.print("Welcome to the Mercedes luxury vehicle");
	}

	@Override
	public int getTopSpeed() {
		return 250;
	}
	
}
