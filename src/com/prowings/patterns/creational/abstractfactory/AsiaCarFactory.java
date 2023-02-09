package com.prowings.patterns.creational.abstractfactory;

public class AsiaCarFactory {
	
	public static Car buildCar(CarType type)
	{
		Car car = null;
		
		switch(type)
		{
		case LUXURY:
			car = new LuxuryCar(Location.ASIA);
			break;
		case SEDAN:
			car = new SedanCar(Location.ASIA);
			break;
		case SMALL:
			car = new SmallCar(Location.ASIA);
			break;
		case SPORTS:
			car = new SportsCar(Location.ASIA);
			break;
		default:
			System.out.println("Invalid car type!!");
			break;
		}
		return car;
	}

}
