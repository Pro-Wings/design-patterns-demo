package com.prowings.patterns.creational.factory;

public class LuxuryCar extends Car{

	public LuxuryCar(CarType carType) {
		super(carType);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Luxury car constructing!!!");
	}

}
