package com.prowings.patterns.creational.singlton;

public class EagerInitialization {

	private static EagerInitialization obj = new EagerInitialization();

	private EagerInitialization() {
		super();
	}

	public static EagerInitialization getInstance() {
		return obj;
	}

}
//Drawback :  Even we do not use this singlton object, it will get created at the time of class loading only.
//            As the object of a class is always created whether you need it or not, this may lead to resource wastage.
//   		  There is also the wastage of CPU time in the unnecessary creation of an instance.
//   		  With this approach, we can not use Exception Handling