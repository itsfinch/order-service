package abstractFactoryPattern4;

public class Harley implements Bike{
	
	public int speed() {
		System.out.println("The speed of the bike is : " + 200);
		return 200;
	}

}