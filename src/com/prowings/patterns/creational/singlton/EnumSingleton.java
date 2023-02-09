package com.prowings.patterns.creational.singlton;

public enum EnumSingleton {

	INSTANCE;
	
	EnumSingleton()
	{
		System.out.println("object initialized!!!");
	}
}
