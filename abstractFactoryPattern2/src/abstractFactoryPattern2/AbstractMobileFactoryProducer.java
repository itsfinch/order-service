package abstractFactoryPattern2;

public class AbstractMobileFactoryProducer {
	
	public MobileFactory getMobileFactory(String value) {
		
		if(value.equals("Economic"))
			return new LowBudgetPhone();
		
		else if(value.equals("HighEnd") || value.equals("Premium"))
			return new HighEndPhone();
		
		return null;
	}

}
