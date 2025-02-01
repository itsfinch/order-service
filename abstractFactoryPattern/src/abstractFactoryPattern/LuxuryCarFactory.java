package abstractFactoryPattern;

public class LuxuryCarFactory implements vehicleFactory{

	@Override
	public Vehicle getInstance(int price) {


		if(price > 10000000 && price <= 20000000)
			return new Audi();
		else if(price > 20000000)
			return new Mercedes();
		return null;
	}

}
