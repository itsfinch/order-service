package abstractFactoryPattern;

public class Hyundai implements Vehicle{
	
	public void average() {
		System.out.print("Welcome to the Hyundai ordinary vehicle");
	}

	@Override
	public int getTopSpeed() {
		// TODO Auto-generated method stub
		return 150;
	}

}
