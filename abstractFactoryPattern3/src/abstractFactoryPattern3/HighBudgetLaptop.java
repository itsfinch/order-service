package abstractFactoryPattern3;

public class HighBudgetLaptop implements abstractFactory{

	@Override
	public Laptop getPrice(int cost) {
		
		if(cost >= 60000 && cost <= 80000)
			return new Dell();
		
		else if(cost > 80000)
			return new HP();
		
		return null;
	}

}
