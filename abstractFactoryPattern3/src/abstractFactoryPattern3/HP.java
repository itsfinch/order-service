package abstractFactoryPattern3;

public class HP implements Laptop{

	@Override
	public void print() {
		System.out.println("THis is the HP laptop");
		
	}

	@Override
	public int price() {
		System.out.println("The price of the laptop is : " + 85000);
		return 85000;
	}

}
