package com.prowings.patterns.creational.singlton;

public class DoubleCheckedLockingThreadSafeSinglton {
	
	private static DoubleCheckedLockingThreadSafeSinglton obj = null;

	private DoubleCheckedLockingThreadSafeSinglton() {
		super();
	}
	
	public  static DoubleCheckedLockingThreadSafeSinglton getInstance()
	{
		if(null == obj)
		{
			synchronized (DoubleCheckedLockingThreadSafeSinglton.class) {
				if(null == obj)
				obj = new DoubleCheckedLockingThreadSafeSinglton();
			}
		}
		return obj;
	}

}
