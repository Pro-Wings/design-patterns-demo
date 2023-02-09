package com.prowings.patterns.creational.singlton;

public class BillPughSinglton {

	private BillPughSinglton() {
		super();
	}
	
	private static class SinltonHelper{
		private static final BillPughSinglton INSTANCE = new BillPughSinglton();
	}

	public static BillPughSinglton getInstance()
	{
		return SinltonHelper.INSTANCE;
	}
}
