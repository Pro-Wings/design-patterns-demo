package com.prowings.patterns.creational.factory;

import com.prowings.patterns.creational.abstractfactory.Location;

public abstract class Car {
	
	private CarType type;
	
	public Car(CarType carType)
	{
		this.type = carType;
		arrangeParts();
	}

	private void arrangeParts() {
		System.out.println("Parts Arranged!!!! for : "+this.type );
	}

	protected abstract void construct();

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}	
	
}
