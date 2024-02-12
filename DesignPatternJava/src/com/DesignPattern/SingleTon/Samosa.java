package com.DesignPattern.SingleTon;

import java.io.Serializable;

// Implemented solution for breaking singleton pattern 

public class Samosa implements Serializable,Cloneable {
	
	private static Samosa samosa;
	
	private Samosa() {
		if(samosa!=null) {
			throw new RuntimeException("You already created samosa");
		}
	}
	
	public static Samosa getSamosa() {
		if(samosa==null) {
			
			synchronized (Samosa.class) {
				if(samosa==null) {
					samosa = new Samosa();
				}
			}
			
			
		}
		return samosa;
	}
	
	public Object readResolve() {
		return samosa;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return samosa;
	}
	
	

}
