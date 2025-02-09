package abstractFactoryPattern3;

public class Acer implements Laptop{

	@Override
	public void print() {
		System.out.println("THis is the Acer laptop");
		
	}

	@Override
	public int price() {
		System.out.println("The price of the laptop is : " + 49000);
		return 49000;
	}

}
