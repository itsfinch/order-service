package abstractFactoryPattern4;

public class Hero implements Bike{
	
	public int speed() {
		System.out.println("The speed of the bike is : " + 80);
		return 80;
	}

}
