package abstractFactoryPattern4;

public class Client {
	
	public static void main(String[] args) {
		AbstractBikeProducer abstractBikeProducer = new AbstractBikeProducer();
		BikeFactory bikeFactory = abstractBikeProducer.getBikes("Premium");
		Bike bike = bikeFactory.getSpeed(100);
		bike.speed();
		
	}

}
