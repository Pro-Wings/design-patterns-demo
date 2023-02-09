package com.prowings.patterns.creational.singlton;

public class ThreadSafeSinglton {

	private static ThreadSafeSinglton obj = null;

	private ThreadSafeSinglton() {
		super();
	}

	public synchronized static ThreadSafeSinglton getInstance() {
		if (null == obj) {
			obj = new ThreadSafeSinglton();
		}
		return obj;
	}

}
