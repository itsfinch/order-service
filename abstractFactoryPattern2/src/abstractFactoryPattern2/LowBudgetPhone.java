package abstractFactoryPattern2;

public class LowBudgetPhone implements MobileFactory{

	@Override
	public Mobile getPrice(int cost) {
		if(cost >= 30000 && cost <= 40000)
			return new Nokia();
		
		else if(cost > 40000 && cost <= 70000)
			return new onePlus();
		
		return null;
	}

}
