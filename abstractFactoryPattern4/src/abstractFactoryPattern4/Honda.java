package abstractFactoryPattern4;

public class Honda implements Bike{
	
	public int speed() {
		System.out.println("The speed of the bike is : " + 100);
		return 100;
	}

}
