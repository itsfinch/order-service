package abstractFactoryPattern2;

public class onePlus implements Mobile{
	
	@Override
	public void name() {
		System.out.println("This is the priciest models phone of onePlus");
		
	}

	@Override
	public int price() {
		System.out.println("The price of this phone is : " + 70000);
		return 70000;
	}

}
