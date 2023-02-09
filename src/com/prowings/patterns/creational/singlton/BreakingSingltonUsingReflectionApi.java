package com.prowings.patterns.creational.singlton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakingSingltonUsingReflectionApi {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		EagerInitialization obj1 = EagerInitialization.getInstance();
		EagerInitialization obj2 = null;
		
	
		Constructor[] constructors = obj1.getClass().getDeclaredConstructors();
		
		for(Constructor con : constructors)
		{
			con.setAccessible(true);
			obj2 = (EagerInitialization) con.newInstance();
		}
		
		System.out.println(obj1 == obj2);
	}

}
