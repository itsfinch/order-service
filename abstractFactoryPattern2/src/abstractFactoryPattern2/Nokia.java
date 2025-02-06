package abstractFactoryPattern2;

public class Nokia implements Mobile{

	@Override
	public void name() {
		System.out.println("This is the base models phone of Nokia");
		
	}

	@Override
	public int price() {
		System.out.println("The price of this phone is : " + 35000);
		return 35000;
	}

}
