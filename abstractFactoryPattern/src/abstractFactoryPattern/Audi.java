package abstractFactoryPattern;

public class Audi implements Vehicle{
	
	public void average() {
		System.out.print("Welcome to the Audi luxury vehicle");
	}

	@Override
	public int getTopSpeed() {
		// TODO Auto-generated method stub
		return 300;
	}

}
