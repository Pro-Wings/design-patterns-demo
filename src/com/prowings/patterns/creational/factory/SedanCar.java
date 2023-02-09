package com.prowings.patterns.creational.factory;

public class SedanCar extends Car{

	public SedanCar(CarType carType) {
		super(carType);
		construct();
	}

	@Override
	protected void construct() {
//		System.out.println("Sedan car constructed!!!");
		System.out.println("Sedan car constructed using new requirements!!!");
	}

}
