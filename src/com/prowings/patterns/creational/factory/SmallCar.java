package com.prowings.patterns.creational.factory;

public class SmallCar extends Car{

	public SmallCar(CarType carType) {
		super(carType);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Small car constructed!!!");
	}

}
