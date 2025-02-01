package abstractFactoryPattern;

public class EconomicCarFactory implements vehicleFactory{
	
	@Override
	public Vehicle getInstance(int price) {
		
		if(price <= 300000)
			return new Maruti();
		else if(price > 300000)
			return new Hyundai();
		return null;
	}

}
