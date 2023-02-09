package com.prowings.patterns.creational.factory;

public class SportsCar extends Car{

	public SportsCar(CarType carType) {
		super(carType);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Sports car constructed!!!");
	}

}
