package com.prowings.patterns.creational.factory;

public class CarFactory {
	
	public static Car buildCar(CarType type)
	{
		Car car = null;
		
		switch(type)
		{
		case LUXURY:
			car = new LuxuryCar(type);
			break;
		case SEDAN:
			car = new SedanCar(type);
			break;
		case SMALL:
			car = new SmallCar(type);
			break;
		case SPORTS:
			car = new SportsCar(type);
			break;
		default:
			System.out.println("Invalid CAR Type!!!");
			break;
		
		}
		return car;
	}

}
