package abstractFactoryPattern;

public class Maruti implements Vehicle{
	
	public void average() {
		System.out.print("Welcome to the Maruti ordinary vehicle");
	}

	@Override
	public int getTopSpeed() {
		// TODO Auto-generated method stub
		return 100;
	}

}
