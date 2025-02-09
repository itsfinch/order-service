package abstractFactoryPattern3;

public class LowBudgetLaptop implements abstractFactory{

	@Override
	public Laptop getPrice(int cost) {
		
		if(cost >= 30000 && cost <= 40000)
			return new Lenovo();
		else if(cost > 40000 && cost <= 50000)
			return new Acer();
		
		return null;
	}

}
