package abstractFactoryPattern2;

public class Samsung implements Mobile{
	
	@Override
	public void name() {
		System.out.println("This is the priciest models phone of Samsung");
		
	}

	@Override
	public int price() {
		System.out.println("The price of this Samsung phone is : " + 90000);
		return 90000;
	}

}
