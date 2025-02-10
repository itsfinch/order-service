package abstractFactoryPattern4;

public class RE implements Bike{
	
	public int speed() {
		System.out.println("The speed of the bike is : " + 150);
		return 150;
	}

}
