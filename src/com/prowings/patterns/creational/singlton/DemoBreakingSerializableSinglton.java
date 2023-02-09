package com.prowings.patterns.creational.singlton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class DemoBreakingSerializableSinglton {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		SerializationSinglton obj1 = SerializationSinglton.getinstance();
		
		//serialize the singlton object
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(obj1);
        out.close();
		
     // deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializationSinglton obj2 = (SerializationSinglton) in.readObject();
        in.close();
        
        System.out.println(obj1 == obj2);
	}

}
