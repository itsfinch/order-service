package abstractFactoryPattern4;

public class ModerateSpeedBike implements BikeFactory{
	
	public Bike getSpeed(int speed) {
		if(speed >= 80 && speed <= 90)
			return new Hero();
		else if(speed >= 90 && speed < 150)
			return new Honda();
		return null;
	}

}
