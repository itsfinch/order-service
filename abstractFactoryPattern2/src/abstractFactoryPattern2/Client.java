package abstractFactoryPattern2;

public class Client {
	
	public static void main(String[] args) {
		
		AbstractMobileFactoryProducer abstractMobileFactoryProducer = new AbstractMobileFactoryProducer();
		MobileFactory mobileFactory = abstractMobileFactoryProducer.getMobileFactory("Premium");
		Mobile mobileObj = mobileFactory.getPrice(90000);
		mobileObj.name();
		System.out.println(mobileObj.price());
		
	}

}
