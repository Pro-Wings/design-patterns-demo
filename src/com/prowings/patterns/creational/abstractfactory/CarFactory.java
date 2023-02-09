package com.prowings.patterns.creational.abstractfactory;

public class CarFactory {
	
	public static Car buildCar(CarType type, Location location)
	{
		Car car = null;
		
		switch(location)
		{
		case ASIA:
			car = AsiaCarFactory.buildCar(type);
			break;
		case DEFAULT:
			car = DefaultCarFactory.buildCar(type);
			break;
		case USA:
			car = USACarFactory.buildCar(type);
			break;
		default:
			System.out.println("We only support Default, Asia and USA locations!!!!");
			break;
			
		}
		return car;
		
	}
}
