package abstractFactoryPattern4;

public class HighSpeedBike implements BikeFactory{
	
	public Bike getSpeed(int speed) {
		if(speed >= 150 && speed <= 190)
			return new RE();
		else if(speed > 190)
			return new Harley();
		return null;
	}

}
