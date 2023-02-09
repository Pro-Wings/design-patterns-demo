package com.prowings.patterns.creational.singlton;

public class StaticBlockInitializationSinglton {
	
	private static StaticBlockInitializationSinglton obj;

	private StaticBlockInitializationSinglton() {
		super();
	}

	static
	{
		try {
			obj = new StaticBlockInitializationSinglton();
		}catch (Exception e) {
			System.out.println("Exception while initializing the object!!");
		}
	}
	
	public static StaticBlockInitializationSinglton getInstance()
	{
		return obj;
	}

}

//Drawback :  Even we do not use this singlton object, it will get created at the time of class loading only.
//As the object of a class is always created whether you need it or not, this may lead to resource wastage.
//There is also the wastage of CPU time in the unnecessary creation of an instance.
