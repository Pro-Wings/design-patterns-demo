package com.prowings.patterns.creational.abstractfactory;

public abstract class Car {
	
	private CarType type;
	private Location location;
	
	public Car(CarType carType, Location location)
	{
		this.type = carType;
		this.location = location;
		arrangeParts();
	}

	private void arrangeParts() {
		System.out.println("Parts Arranged!!!! for : "+this.type +" for location : "+this.location);
	}

	protected abstract void construct(Location location);

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
}
