package abstractFactoryPattern4;

public class AbstractBikeProducer {
	
	public BikeFactory getBikes(String type) {
		if(type.equals("Premium") || type.equalsIgnoreCase("HighSpeed"))
			return new HighSpeedBike();
		else if(type.equalsIgnoreCase("Moderate") || type.equalsIgnoreCase("LowSpeed"))
			return new ModerateSpeedBike();
		return null;
	}

}
