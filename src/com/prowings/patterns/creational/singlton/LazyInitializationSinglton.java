package com.prowings.patterns.creational.singlton;

public class LazyInitializationSinglton {

	private static LazyInitializationSinglton obj = null;

	private LazyInitializationSinglton() {
		super();
	}

	public static LazyInitializationSinglton getSingltonObject() {
		if (obj == null) {
			obj = new LazyInitializationSinglton();
		}
		return obj;
	}

}
//Benefit : Object gets created when actually needed!!

//Drawback : 
//There is a need to check the condition of null each time.
//We cannot access the object of the class directly.
//The preceding implementation works fine in the case of the single-threaded environment, but when it comes to multi-threaded systems, it can cause issues if multiple threads are inside the if condition at the same time. It will destroy the singleton pattern and both threads will get different instances of the singleton class. In the next section, we will see different ways to create a thread-safe singleton class.