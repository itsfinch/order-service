package abstractFactoryPattern3;

public class Dell implements Laptop{

	@Override
	public void print() {
		System.out.println("THis is the Dell laptop");
		
	}

	@Override
	public int price() {
		System.out.println("The price of the laptop is : " + 75000);
		return 75000;
		
	}

}
