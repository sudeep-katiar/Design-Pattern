package com.blblz.singletonlink;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationSingleton implements Serializable {

	private static final long serialVersionUID = -7604766932017737115L;

	private SerializationSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializationSingleton instance = new SerializationSingleton();
	}

	public static SerializationSingleton getInstance() {
		return SingletonHelper.instance;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializationSingleton instanceOne = SerializationSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();
        
		// deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SerializationSingleton instanceTwo = (SerializationSingleton) in.readObject();
        in.close();
        
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
        
    }

}
