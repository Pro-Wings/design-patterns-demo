package com.prowings.patterns.creational.singlton;

public class TestSinglton {
	
	public static void main(String[] args) {
		
		LazyInitializationSinglton obj1 = LazyInitializationSinglton.getSingltonObject();
		
		LazyInitializationSinglton obj2 = LazyInitializationSinglton.getSingltonObject();
		
		System.out.println(obj1 == obj2);
		
		
		EagerInitialization ob1 = EagerInitialization.getInstance();
		EagerInitialization ob2 = EagerInitialization.getInstance();
		
		System.out.println(ob1 == ob2);

		
		StaticBlockInitializationSinglton o1 = StaticBlockInitializationSinglton.getInstance();
		StaticBlockInitializationSinglton o2 = StaticBlockInitializationSinglton.getInstance();
	
		System.out.println(o1 == o2);

		BillPughSinglton object1 = BillPughSinglton.getInstance();
		BillPughSinglton object2 = BillPughSinglton.getInstance();
		System.out.println(object1 == object2);
		
		EnumSingleton instance1 = EnumSingleton.INSTANCE;
		EnumSingleton instance2 = EnumSingleton.INSTANCE;
		System.out.println(instance1 == instance2);
	}

}
