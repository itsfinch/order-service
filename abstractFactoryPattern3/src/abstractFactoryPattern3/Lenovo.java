package abstractFactoryPattern3;

public class Lenovo implements Laptop{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int price() {
		System.out.println("The price of the laptop is : " + 35000);
		return 35000;
	}

}
