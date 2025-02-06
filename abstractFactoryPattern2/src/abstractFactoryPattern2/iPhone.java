package abstractFactoryPattern2;

public class iPhone implements Mobile{
	
	@Override
	public void name() {
		System.out.println("This is the priciest phone iPhone");
	}
	
	@Override
	public int price() {
		System.out.println("The price of the iphone is : " + 100000);
		return 100000;
	}

}
