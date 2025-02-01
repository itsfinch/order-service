package abstractFactoryPattern;

public class ClientCode {
	
	public static void main(String[] args) {
		
		abstractProducer absProducer = new abstractProducer();
		vehicleFactory vehFactory = absProducer.getFactoryInstance("Premium");
		Vehicle vehicle = vehFactory.getInstance(25000000);
		System.out.println(vehicle.getTopSpeed());
		vehicle.average();
	}

}
