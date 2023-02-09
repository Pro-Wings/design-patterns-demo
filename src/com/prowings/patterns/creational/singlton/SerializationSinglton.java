package com.prowings.patterns.creational.singlton;

import java.io.Serializable;

public class SerializationSinglton implements Serializable{

	private static final long serialVersionUID = 5996185816830223588L;

	private SerializationSinglton() {
		super();
	}
	
	private static class SingltonHelper{
		private static final SerializationSinglton instance = new SerializationSinglton();
	}

	public static SerializationSinglton getinstance()
	{
		return SingltonHelper.instance;
	}
	
	public Object readResolve() {
	      System.out.println("Executing readResolve");
	      return SerializationSinglton.getinstance(); 
	   }
}
