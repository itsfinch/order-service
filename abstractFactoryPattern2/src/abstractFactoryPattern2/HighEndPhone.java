package abstractFactoryPattern2;

public class HighEndPhone implements MobileFactory{

	@Override
	public Mobile getPrice(int cost) {
		
		if(cost > 70000 && cost <= 92000)
			return new Samsung();
		
		else if(cost > 92000)
			return new iPhone();
		
		return null;
	}

}
