package com.DesignPattern.SingleTon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		Samosa samosa = Samosa.getSamosa();
//		System.out.println(samosa.hashCode());
//		
		Samosa samosa2 = Samosa.getSamosa();
		System.out.println(samosa2.hashCode());
		
		//Breaking single ton pattern
		
		Samosa samosa = Samosa.getSamosa();
		System.out.println(samosa.hashCode());
		
//		1. using reflection api
//		solution :-1. If object is there -> throw exception inside constructor
//				   2. Use Enum
		
		
		
//		Constructor<Samosa> constructor=Samosa.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		Samosa samosa2=constructor.newInstance();
//		
//		System.out.println(samosa2.hashCode());
		
//		2.	Using Deserialization
//		solution :- implement Read Resolve
		
		
//		ObjectOutputStream oos;
//		try {
//			oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//			oos.writeObject(samosa);
//			oos.close();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		ObjectInputStream ois;
//		
//		try {
//			ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//			Samosa s=(Samosa)ois.readObject();
//			System.out.println(s.hashCode());
//			ois.close();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
//		3. Using Object Cloning
//		solution :- override clone method and return same instanse
		
//		try {
//			Samosa s_clone=(Samosa) samosa.clone();
//			System.out.println("After Clonning");
//			System.out.println(s_clone.hashCode());
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		 
		
	}
}
